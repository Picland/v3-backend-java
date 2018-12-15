package com.earth.user.controller;

import com.earth.user.bean.UserBean;
import com.earth.user.dao.UserInfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.sql.DataSource;
import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserInfoController {
  @Autowired
  SqlSessionFactory sqlSessionFactory;

  @Autowired
  DataSource dataSource;

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> getAllUsers() {

    SqlSession session = sqlSessionFactory.openSession();
    List<UserBean> userBeans = null;
    try {
      UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
      userBeans = mapper.getAll();
    } catch (Exception e) {
      throw (e);
    } finally {
      session.close();
    }
//    UserBean userBean = new UserBean();
//    userBean.setUserId(id);
//    userBean.setPhoneNumber("18962000003");
//    userBean.setName("小米粒222");
//    userBean.setGender("M");
//    userBean.setEmail("ww@qq.com");
//    userBean.setAvatar("upload_584d24786e923bc1a4f384ebf7ea77a5.jpg");
//    userBean.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
    return ResponseEntity.ok().body(userBeans);
  }

  @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> getUserById(@PathVariable String id) {

    SqlSession session = sqlSessionFactory.openSession();
    UserBean userBean = null;
    try {
      UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
      userBean = mapper.getUser(id);
    } catch (Exception e) {
      throw (e);
    } finally {
      session.close();
    }
//    UserBean userBean = new UserBean();
//    userBean.setUserId(id);
//    userBean.setPhoneNumber("18962000003");
//    userBean.setName("小米粒222");
//    userBean.setGender("M");
//    userBean.setEmail("ww@qq.com");
//    userBean.setAvatar("upload_584d24786e923bc1a4f384ebf7ea77a5.jpg");
//    userBean.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
    return ResponseEntity.ok().body(userBean);
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
    return ResponseEntity.noContent().build();
  }

}
