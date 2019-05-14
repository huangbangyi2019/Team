package com.nnxy.team5;

public class likehui {

	private int id;
	private String color;
	private String age;
	private int sex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public likehui(int id, String color, String age, int sex) {
		super();
		this.id = id;
		this.color = color;
		this.age = age;
		this.sex = sex;
	}
	
}
