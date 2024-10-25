package com.devops.java.dockerdemo.helper;

import com.devops.java.dockerdemo.model.Auto;
import com.devops.java.dockerdemo.repository.AutoRepository;
import jakarta.annotation.PostConstruct;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DatabaseSeeder {

  private AutoRepository autoRepository;

  @PostConstruct
  public void insertData() {
    Auto bmw = new Auto("BMW","Disel",240,"BWM X5");
    Auto tesla = new Auto("Tesla", "Electro", 240, "Tesla Model Y");
    Auto audi = new Auto("Audi", "Benzin", 220, "Audi Q7");
    Auto toyota = new Auto("Toyota", "Hybrid", 220, "Camry");

    autoRepository.saveAll(List.of(bmw, tesla, audi, toyota));
  }
}
