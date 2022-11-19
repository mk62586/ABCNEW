package com.example.demo.service;

import com.example.demo.entity.DvcEmployee;
import com.example.demo.repository.DVCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DVCService {
    @Autowired
    private DVCRepository dvcRepo;

   public DvcEmployee saveDVCEmployee(DvcEmployee dvcEmployee){
      return dvcRepo.save(dvcEmployee);
   }
   public DvcEmployee getEmployee(long id){
       return dvcRepo.findById(id).orElse(null);
   }
}
