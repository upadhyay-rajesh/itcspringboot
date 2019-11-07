package com.spring_core;

public class Trainees {
	I ii;
	//setter is adapter
	public void setIi(I ii){
		this.ii=ii;
	}

	public void get(){
		ii.teach();
	}
	public static void main(String arg[]){

		
		Trainees tt=new Trainees();
		//****************spring BeanFactory work start
		I i1=new Trainer();  //1. create object
		tt.setIi(i1); //2. do the Dependency Injection  
		
		//*************spring BeanFactory work end
			
		tt.get();
	}
}
