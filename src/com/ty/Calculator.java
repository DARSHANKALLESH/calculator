package com.ty;

public class Calculator {

	public void  add(int a,int b) {
		System.out.println(a+b);
		
			}

	 public void  sub(int a,int b) {
		  System.out.println(a-b);
		 
	 }
	 
	 public void mul(int a,int b) {
		  System.out.println( a*b);
		
		 
	 }
	 
	 public void div(int a, int b) {
		
		 System.out.println(a/b);
		 
		 
	 }
	public static void main(String[] args) {
		
		Calculator c= new Calculator();
		c.add(10,20 );
		c.sub(60, 50);
		c.mul(20, 2);
		c.div(25, 5);
	}
}



