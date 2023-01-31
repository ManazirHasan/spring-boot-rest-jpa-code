package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/test")
    public List<Employee> test(@Valid @RequestBody Employee employee) throws MethodArgumentNotValidException {
        Long x = System.currentTimeMillis();
        return  employeeService.addEmployee(employee);
    }
}
