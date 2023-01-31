package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @Column
    Integer id;

    @Column(name="name")
    String name;

}
