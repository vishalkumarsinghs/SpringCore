package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/Testconfig.xml");
	
		Person Person1= con.getBean("person1", Person.class);
		System.out.println(Person1);
	System.out.println(Person1.getFrinds().getClass().getName());
	
	System.out.println("============================================");
	System.out.println(Person1.getFeestructure());
	
	System.out.println(Person1.getFeestructure().getClass().getName());
	
	System.out.println("============================================");
	System.out.println(Person1.getProperties());
	System.out.println(Person1.getProperties().getClass().getName());
	
	}
}