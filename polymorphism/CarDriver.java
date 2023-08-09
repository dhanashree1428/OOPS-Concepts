package com.jsp.polymorphism;

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Car c1=new Car("BMW","X1",7500000,"White");
   System.out.println(c1);
   Car c2=new Car("BMW","X1",7500000,"White");
   System.out.println(c1.equals(c2));
   
   System.out.println("========");
   System.out.println(c1.hashCode());
   System.out.println(c2.hashCode());
   
	}

}
