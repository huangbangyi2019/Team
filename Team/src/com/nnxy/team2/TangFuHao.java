package com.nnxy.team2;

public class TangFuHao {
	private int ID;
	private String name;
	private int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setInformation(062,"ÌÆ¸»ºÀ",18);
		
		
	}

	private static void setInformation(int id,String name,int age) {
		// TODO Auto-generated method stub
		System.out.println("ID:"+id+"ÐÕÃû£º"+name+"ÄêÁä£º"+age);
		
	}
	public TangFuHao() {
		
		// TODO Auto-generated constructor stub
	}

	public TangFuHao(int iD, String name, int age) {
		
		ID = iD;
		this.name = name;
		this.age = age;
	}
	public int Sum(int x, int y) {
		return x+y+2;
	}
	public int divide(int x , int y) {
		return x/y;
	}
	

}
