package com.nnxy.team2;

public class huangxianjie {
	private int ID;   //idºÅ
	private String Name;   //ÐÕÃû
	private String Password; //666
	private int Sex;  //man
	private int Age;  //twenty
	
	
	

	public huangxianjie(int iD, String name, String password, int sex, int age) {
		super();
		ID = iD;
		Name = name;
		Password = password;
		Sex = sex;
		Age = age;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public int getSex() {
		return Sex;
	}


	public void setSex(int sex) {
		Sex = sex;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	@Override
	public String toString() {
		return "huangxainjie059 [ID=" + ID + ", Name=" + Name + ", Password=" + Password + ", Sex=" + Sex + ", Age=" + Age
				+ "]";
	}

}
