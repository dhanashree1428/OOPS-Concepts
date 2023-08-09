package com.jsp.inheritance;

public class Driver {
  public static void main (String args[]) {
	  //Case 1
	  A a=new B(); //Upcasting
	  B b=(B)a;    //Downcasting
	  System.out.println(b.j);
	  
//	  //Case 2
//	  A a1=new B();  //Upcasting
//	  C c=(C)a1;     //Downcasting
//	  System.out.println(c.k);  //leads to classCastException
	  
	  //Case 3
	  A a3=new C();
	  B b2=(B)a3;
	  System.out.println(b2.i);
  }
}
