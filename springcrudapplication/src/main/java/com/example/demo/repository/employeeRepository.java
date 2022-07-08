package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.employee;

@Repository
public interface employeeRepository extends CrudRepository<employee, Integer> {

}
