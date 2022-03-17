package com.shivam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TestBean {

    @Autowired
    private SpringServiceTest springServiceTestOne;

    @Autowired
    @Qualifier("newBean")
    private  SpringServiceTest springServiceTestTwo;

    public void method1(){
        springServiceTestOne.method1();
    }

    public void method2(){
        springServiceTestTwo.methodNew1();
    }
}
