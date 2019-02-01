package com.earth.user.controller;

import com.earth.user.bean.UserBean;
import com.earth.user.dao.UserInfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserInfoController {
  private static Logger logger = LoggerFactory.getLogger(UserInfoController.class);

  private final SqlSessionFactory sqlSessionFactory;

  @Autowired
  public UserInfoController(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> getAllUsers() {
    try (SqlSession session = sqlSessionFactory.openSession()) {
      logger.info("Get all");
      UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
      List<UserBean> userBeans = mapper.getAll();
      return ResponseEntity.ok().body(userBeans);
    } catch (Exception e) {
      logger.error("Fail to get all users", e);
      throw (e);
    }
  }

  @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> getUserById(@PathVariable String id) {
    try (SqlSession session = sqlSessionFactory.openSession()) {
      UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
      UserBean userBean = mapper.getUser(id);
      return ResponseEntity.ok().body(userBean);
    } catch (Exception e) {
      logger.error(String.format("Fail to get user by %s", id), e);
      throw (e);
    }
  }

  @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> replaceUser(@PathVariable String id, @RequestBody UserBean newUser) {
    return ResponseEntity.noContent().build();
  }

  @PatchMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> mergeUser(@PathVariable String id, @RequestBody UserBean newUser) {
    return ResponseEntity.noContent().build();
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> createUser(@RequestBody UserBean newUser, UriComponentsBuilder uriBuilder) {
    UriComponents uriComponents = uriBuilder.path("/users/{id}").buildAndExpand(newUser.getUserId());
    return ResponseEntity.created(uriComponents.toUri()).body(newUser);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<?> deleteUser(@PathVariable String id) {
    try (SqlSession session = sqlSessionFactory.openSession()) {
      UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
      UserBean userBean = mapper.getUser(id);
      if (userBean == null) {
        return ResponseEntity.notFound().build();
      }
      mapper.deleteUser(id);
      return ResponseEntity.noContent().build();
    } catch (Exception e) {
      logger.error(String.format("Fail to get user by %s", id), e);
      throw (e);
    }
  }
}
