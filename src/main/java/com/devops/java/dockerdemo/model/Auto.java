package com.devops.java.dockerdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "auto")
@Data
public class Auto {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String fuel;
  private int maxSpeed;
  private String description;

  public Auto() {}

  public Auto(String name, String fuel, int maxSpeed, String description) {
    this.name = name;
    this.fuel = fuel;
    this.maxSpeed = maxSpeed;
    this.description = description;
  }
}
