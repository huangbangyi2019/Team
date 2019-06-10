package com.nnxy.team2;

import com.nnxy.team4.lixuexia;

public class weixiaoling {
	private int age;
	private int name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + name;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		weixiaoling other = (weixiaoling) obj;
		if (age != other.age)
			return false;
		if (name != other.name)
			return false;
		return true;
	}
	

}
