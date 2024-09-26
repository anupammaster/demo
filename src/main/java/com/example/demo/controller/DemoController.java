package com.example.demo.controller;

import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/getDetails")
    public String getDetails(){
        return "hello";
    }

    @PostMapping("/saveDemo")
    public DemoEntity saveDemo(DemoEntity demoEntity){
        return demoService.saveDemo(demoEntity);
    }
}
