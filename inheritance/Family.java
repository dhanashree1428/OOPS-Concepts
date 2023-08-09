package com.jsp.inheritance;

public class Family {
	public static void main (String args[]) {
//  Son s=new Son();
//  s.buyLand();
//  s.buildHouse();
//  s.buyCar();
  
//  Father f=new Son(); //Upcasting
//  Son s=(Son)f; //Downcasting
//  s.buyCar();
		
Grandfather g=new Father(); //Upcasting
Father f=(Father)g; //Downcasting
f.buyLand();
	}  }
