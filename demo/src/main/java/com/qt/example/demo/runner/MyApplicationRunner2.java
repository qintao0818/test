package com.qt.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner2 implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("我启动了2");
		
	}


}
