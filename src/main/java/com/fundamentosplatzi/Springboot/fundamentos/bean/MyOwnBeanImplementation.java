package com.fundamentosplatzi.Springboot.fundamentos.bean;

public class MyOwnBeanImplementation implements MyOwnBean{
    private AgregarSaludo agregarSaludo;

    public MyOwnBeanImplementation(AgregarSaludo agregarSaludo) {
        this.agregarSaludo = agregarSaludo;
    }

    @Override
    public void printMyOwnBean() {
     int index = 2;
        System.out.println(agregarSaludo.addSaludo(index)+" desde mi propia  dependencia");
    }
}
