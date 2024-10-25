package com.devops.java.dockerdemo.service;

import com.devops.java.dockerdemo.model.Auto;
import com.devops.java.dockerdemo.repository.AutoRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AutoService {

  private final AutoRepository autoRepository;

  public List<Auto> getAll(){
    return autoRepository.findAll();
  }
}
