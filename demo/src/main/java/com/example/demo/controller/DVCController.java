package com.example.demo.controller;

import com.example.demo.entity.DvcAdress;
import com.example.demo.entity.DvcEmployee;
import com.example.demo.service.DVCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DVCController {

    @Autowired
   private DVCService dvcService;

    @PostMapping("/saveDVC")
    public void dvcEmployee(@RequestBody DvcEmployee dvcEmployee){
       // List<DvcEmployee> li = new ArrayList<>();
       // li.forEach(System.out::println);

        dvcService.saveDVCEmployee(dvcEmployee);
    }

     @GetMapping("/fetchById/{id}")
     public DvcEmployee getDvcEmployee(@PathVariable("id") long id){

       return dvcService.getEmployee(id);


     }
}
