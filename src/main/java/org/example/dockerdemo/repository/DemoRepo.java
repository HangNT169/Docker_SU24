package org.example.dockerdemo.repository;

import org.example.dockerdemo.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepo extends JpaRepository<DemoEntity, Integer> {


}
