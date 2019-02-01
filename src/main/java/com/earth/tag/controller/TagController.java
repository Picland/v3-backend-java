package com.earth.tag.controller;

import com.earth.tag.bean.TagInfoBean;
import com.earth.tag.dao.TagInfoMapper;
import com.earth.user.bean.UserBean;
import com.earth.user.controller.UserInfoController;
import com.earth.user.dao.UserInfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {
  private static Logger logger = LoggerFactory.getLogger(TagController.class);

  private final SqlSessionFactory sqlSessionFactory;

  @Autowired
  public TagController(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> getAllUsers() {
    try (SqlSession session = sqlSessionFactory.openSession()) {
      logger.info("Get all");
      TagInfoMapper mapper = session.getMapper(TagInfoMapper.class);
      List<TagInfoBean> tags = mapper.getAllTags();
      return ResponseEntity.ok().body(tags);
    } catch (Exception e) {
      logger.error("Fail to get all tags", e);
      throw (e);
    }
  }
}
