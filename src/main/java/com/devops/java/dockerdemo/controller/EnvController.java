package com.devops.java.dockerdemo.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {

  @GetMapping("/dockerdemo/envs")
  public Map<String, String> getEnvironment() {
    return System.getenv();
  }
}
