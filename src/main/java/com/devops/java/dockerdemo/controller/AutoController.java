package com.devops.java.dockerdemo.controller;

import com.devops.java.dockerdemo.model.Auto;
import com.devops.java.dockerdemo.service.AutoService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AutoController {

  private final AutoService autoService;

  @GetMapping("/dockerdemo/auto/all")
  public List<Auto> getAuto(){
    return autoService.getAll();
  }
}
