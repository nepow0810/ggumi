package com.nepow.ggumi.controller;

import com.nepow.ggumi.model.User;
import com.nepow.ggumi.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IndexController {

  private final UserService userService;

  @GetMapping("/")
  public String index() {
    return "test";
  }

  @GetMapping("/test1")
  public List<User> index2() {
    List<User> list = userService.getUserList();
    return list;
  }

  @GetMapping("/test2")
  public String index3() {
    User user = new User();
    user.setUserId("aa");
    user.setUserName("bb");
    userService.createUser(user);
    return "success";
  }
}
