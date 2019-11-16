package com.spring_core;

import org.springframework.stereotype.Component;

@Component("c2")
public class Trainer1 implements I{
	public void teach(){
		System.out.println("trainer 1 teaching");
	}
}