package com.fundamentosplatzi.Springboot.fundamentos.bean;

public class MyOperationImplement implements MyOperation{


    @Override
    public int sum(int number) {
        return number+1;
    }
}
