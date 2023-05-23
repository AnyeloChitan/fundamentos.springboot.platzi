package com.fundamentosplatzi.Springboot.fundamentos.configuration;


import com.fundamentosplatzi.Springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//configuracion adicional de los beans . dependencias propias
@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){

        return new MyBean2Implement();
    }
    @Bean
    public MyOperation beanOperation2(){

        return new MyOperationImplement();
    }
    @Bean
    public AgregarSaludo agregarSaludo(){

        return new AgregarSaludoImplement();
    }
    @Bean
    public MyOwnBean myOwnBean(AgregarSaludo agregarSaludo){

        return new MyOwnBeanImplementation(agregarSaludo);
    }
    @Bean
    public MyBeanWithDependency myBeanWithDependency(MyOperation myOperation){

        return new MyBeanWithDependencyImplement(myOperation);
    }

}
