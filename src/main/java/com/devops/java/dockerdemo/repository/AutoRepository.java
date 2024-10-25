package com.devops.java.dockerdemo.repository;

import com.devops.java.dockerdemo.model.Auto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long> {

  List<Auto> findAll();
}
