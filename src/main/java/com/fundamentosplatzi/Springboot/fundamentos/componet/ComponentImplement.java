package com.fundamentosplatzi.Springboot.fundamentos.componet;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency {

    @Override
    public void saludar() {
        System.out.println("Hola Mundo desde mi componente");
    }
}
