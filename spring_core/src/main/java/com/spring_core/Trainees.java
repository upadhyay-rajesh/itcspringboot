package com.spring_core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("def")
public class Trainees {
	
	@Autowired
	@Qualifier("c2")
	I ii;
	//setter is adapter
	/*public void setIi(I ii){
		this.ii=ii;
	}*/
	@Autowired
	@Qualifier("c1")
	I ii1;

	public void get(){
		ii.teach();
		ii1.teach();
	}
	public static void main(String arg[]){
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("test.xml");
		Trainees tt=(Trainees)ctx.getBean("def");
		
		//****************spring BeanFactory work start
		//I i1=new Trainer();  //1. create object
		//tt.setIi(i1); //2. do the Dependency Injection  
		
		//*************spring BeanFactory work end
			
		tt.get();
	}
}
