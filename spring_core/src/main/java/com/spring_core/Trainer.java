package com.spring_core;

import org.springframework.stereotype.Component;

@Component("c1")
public class Trainer implements I{
	public void teach(){
		System.out.println("trainer teaching");
	}
}