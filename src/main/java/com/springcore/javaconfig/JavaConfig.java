package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	
	
	@Bean(name ={"Student","con","temp"})
	public Student getStudent() {
		
		//creating a new student object
		Student student= new Student(getSamosa());
		return student;
	}

}
