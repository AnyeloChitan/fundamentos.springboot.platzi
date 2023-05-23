package com.fundamentosplatzi.Springboot.fundamentos;

import com.fundamentosplatzi.Springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.Springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentosplatzi.Springboot.fundamentos.bean.MyOwnBean;
import com.fundamentosplatzi.Springboot.fundamentos.componet.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	private MyOwnBean myOwnBean;


	//aqui se hace la inyeccon de dependencias mediante constructor
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency, MyOwnBean myOwnBean){
		this.componentDependency=componentDependency;
		this.myBean=myBean;
		this.myBeanWithDependency =myBeanWithDependency;
		this.myOwnBean=myOwnBean;
	}


	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	//este metodo run ejecuta en la aplicacion lo que queramos
	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
		myOwnBean.printMyOwnBean();

	}
}
