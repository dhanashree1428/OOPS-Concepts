package com.jsp.encapsulation;

public class Student {
 private String name;
 private String email;
 private int id;
 private long cno;

 //setter for name
 public void setName(String name) {
	 this.name=name;
 }
 //getter for name
	 public String getName() {
		 return name;
	 }
	//setter for email
	public void setEmail(String email) {
		this.email=email;
	}
	//getter for email
	public String getemail() {
		return email;
	}
	//setter for id
		public void setId(int id) {
			this.id=id;
		}
		//getter for cno
		public int getid() {
			return id;
		}
		//setter for cno
				public void setcno(long cno) {
					this.cno=cno;
				}
				//getter for id
				public long getcno() {
					return cno;
	           }
}

