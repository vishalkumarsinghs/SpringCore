package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
     context.registerShutdownHook();
//     Boy b1=(Boy)context.getBean("b1");
//     System.out.println(b1);
//    // context.registerShutdownHook();
//     
//     System.out.println("++++++++++++++++++++++++++++++++++++++++");
//     
//         Girl g1=(Girl)context.getBean("g1");
//         System.out.println(g1);
     
     Example E1=(Example)context.getBean("E1");
     System.out.println(E1);
	}
}
