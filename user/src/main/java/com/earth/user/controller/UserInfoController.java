package com.earth.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

  @RequestMapping(value = "/username", method = RequestMethod.GET)
  public String getUserName() {
    return "test";
  }
}
