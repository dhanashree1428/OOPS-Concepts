package com.jsp.encapsulation;

public class StudentDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student student=new Student();
 student.setId(28);
 student.setName("Dhanashree");
 student.setEmail("xyz@gmail.com");
 student.setcno(930704563);
 System.out.println(student.getName());
 System.out.println(student.getid());
 System.out.println(student.getemail());
 System.out.println(student.getcno());
	}

}