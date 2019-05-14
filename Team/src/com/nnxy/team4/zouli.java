package com.nnxy.team4;

public class zouli {
	private int Id;
	private String name;
	private int sex;
	private int age;
	private String address;
	
	private int add(int x,int y) {
		return x+y;
	}

	public zouli(int id, String name, int sex, int age, String address) {
		super();
		Id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
