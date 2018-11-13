package com.leo.springsecuritydemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: 测试
 *
 * @author LIULE9
 * @create 2018-11-13 10:52 AM
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

  @GetMapping
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok("hello");
  }

}