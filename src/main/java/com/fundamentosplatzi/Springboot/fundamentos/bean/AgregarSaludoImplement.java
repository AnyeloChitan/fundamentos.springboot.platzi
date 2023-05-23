package com.fundamentosplatzi.Springboot.fundamentos.bean;

public class AgregarSaludoImplement implements AgregarSaludo{



    @Override
    public String addSaludo(int index) {
        String[] saludos ={"buen dia","Buena tarde","Buena noche"};
        return saludos[index];
    }
}
