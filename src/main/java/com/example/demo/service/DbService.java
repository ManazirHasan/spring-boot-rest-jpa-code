package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DbService {
    DbService(){

        System.out.println("-------------DbService-------------------");
    }
    void myService() {
        System.out.printf("-------DbService---------");
        //throw new Exception("/from DB service");
    }
}

@Component
class Test{
    Test(){
        System.out.println("-------------Test-------------------");
    }
    void check(){

    }
}
