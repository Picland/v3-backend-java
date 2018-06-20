package com.earth.user.controller;

import com.earth.user.bean.UserBean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
@RequestMapping("/users")
public class UserInfoController {

  @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public UserBean getUserById(@PathVariable String id) {
    UserBean userBean = new UserBean();
    userBean.setUserId(id);
    userBean.setPhoneNumber("18962000003");
    userBean.setName("小米粒222");
    userBean.setGender("M");
    userBean.setEmail("ww@qq.com");
    userBean.setAvatar("upload_584d24786e923bc1a4f384ebf7ea77a5.jpg");
    userBean.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
    return userBean;
  }

  @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public UserBean replaceUser(@PathVariable String id, @RequestBody UserBean newUser) {
    return newUser;
  }

  @PatchMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public UserBean mergeUser(@PathVariable String id, @RequestBody UserBean newUser) {
    return newUser;
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public UserBean createUser(@RequestBody UserBean newUser) {
    return newUser;
  }

}
