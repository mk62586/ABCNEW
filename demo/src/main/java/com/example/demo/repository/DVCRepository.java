package com.example.demo.repository;

import com.example.demo.entity.DvcEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.Optional;

@Repository
public interface DVCRepository extends JpaRepository<DvcEmployee, Long> {

}
