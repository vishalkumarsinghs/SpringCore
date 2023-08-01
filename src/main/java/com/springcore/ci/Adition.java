package com.springcore.ci;

public class Adition {

	private int a;
	private int b;
	
	private Adition(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("constructer :int,int");
	}

	private Adition(double a,double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("constructer :double  , double");
	}
	
	public void dosum() {
		System.out.println("sum is the value=" +(this.a + this.b));
	
	}		
}
