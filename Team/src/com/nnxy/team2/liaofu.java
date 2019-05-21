package com.nnxy.team2;

public class liaofu {
	private int ID;   //idºÅ
	private String Name;   //ÐÕÃû
	private String Password; //666
	private int Sex;  //man
	private int Age;  //twenty
	
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}

public class a {

		private int id;

		public int getId() {
			return id + 800;
		}

		public void setId(int id) {
			this.id = id;
		}
		
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
		return "liaofu057 [ID=" + ID + ", Name=" + Name + ", Password=" + Password + ", Sex=" + Sex + ", Age=" + Age
				+ "]";
	}


}
