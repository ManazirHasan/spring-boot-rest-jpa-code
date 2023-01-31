package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> addEmployee(Employee employee){
        employeeRepository.save(employee);

        List<Employee> list = StreamSupport
                .stream( employeeRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());

        List<Employee> list2 = StreamSupport
                .stream(Spliterators.spliteratorUnknownSize(employeeRepository.findAll().iterator(),0), false)
                .collect(Collectors.toList());
        System.out.println(list);

        return list;
    }
}
