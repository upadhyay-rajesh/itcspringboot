package com.spring_core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("c1")
public class Trainer implements I{
	public void teach(){
		System.out.println("trainer teaching");
	}
	
	@PostConstruct
	public void add() {
		System.out.println("dsvds");
	}
	
	@PreDestroy
	public void sub() {
		System.out.println("dsvds");
	}
}