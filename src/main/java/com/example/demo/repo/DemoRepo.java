package com.example.demo.repo;

import com.example.demo.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepo extends JpaRepository<DemoEntity, Long> {
}
