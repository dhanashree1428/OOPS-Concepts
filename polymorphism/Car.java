package com.jsp.polymorphism;
//Example of run-time polymorphism
//3 object class methods
public class Car {
 String brand;
 String name;
 String color;
 double price;
 public Car(String b,String n,double p,String c) {
	 this.brand=b;
	 this.name=n;
	 this.price=p;
	 this.color=c;
 }
 
 public String toString() {
	 return "["+brand+","+name+","+color+","+price+"]";
			 }
 
 public boolean equals(Object o) { //upcasting
	 Car c=(Car)o;                 //downcasting
	 if(this.brand==brand&&this.color==color&&this.name==c.name&&this.price==c.price) {
		 return true;
	 }else {
		 return false;
	 }
 }
 
// public int hashCode() {
//	 return Objects.hash(name,brand,color,price);
// }
}
