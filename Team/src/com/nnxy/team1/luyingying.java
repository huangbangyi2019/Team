package com.nnxy.team1;

public class luyingying {
	private int name;
	private String username;
	private String password;
	private int sex;
	public int getId() {
		return name;
	}
	public void setId(int name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public luyingying(int name, String username, String password, int sex) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.sex = sex;
	}
	

}
