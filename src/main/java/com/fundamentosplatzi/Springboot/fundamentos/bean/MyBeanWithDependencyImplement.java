package com.fundamentosplatzi.Springboot.fundamentos.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{


    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero =1;
        System.out.println(myOperation.sum(numero));
        System.out.println("hola desde la implementacon de un Bean con dependencia");
    }
}
