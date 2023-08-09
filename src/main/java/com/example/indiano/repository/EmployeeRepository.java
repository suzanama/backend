package com.example.indiano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.indiano.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {

}
    

