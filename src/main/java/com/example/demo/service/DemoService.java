package com.example.demo.service;

import com.example.demo.entity.DemoEntity;
import com.example.demo.repo.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DemoService {
    @Autowired
    private DemoRepo demoRepo;

    public DemoEntity saveDemo(DemoEntity demoEntity){
        return demoRepo.save(demoEntity);
    }
}
