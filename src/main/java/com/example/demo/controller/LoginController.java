package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiao liang
 * @version V1.0
 * @Package com.example.demo.controller
 * @Title: LoginController
 * @Description:
 * @date 2019/1/3 10:26
 */
@RestController
public class LoginController {

  @RequestMapping("user")
  public Object login(String user){
    if ("qinliang".equals(user)){
      return "success";
    }else {
      return "error";
    }
  }

}
