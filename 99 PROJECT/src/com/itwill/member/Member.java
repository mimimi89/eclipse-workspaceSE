package com.itwill.member;

import java.io.Serializable;

public class Member implements Serializable {
	/*
	 * 중복되지 않아야 하는 필드
	 */
	private String id;	
	private String password;	
	private String name;
	private String address;
	private int age;
	private boolean married;
	
	
	public Member() {
		
		
	}


	public Member(String id, String password, String name, String address, int age, boolean married) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.age = age;
		this.married = married;
	}

	
	public boolean matchPassword(String password) {
		if(this.password.contentEquals(password)) {
			return true;
		}else {
			return false;
		}
	}
	

	public String getId() {
		return id;
	}


	public String getPassword() {
		return password;
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public int getAge() {
		return age;
	}


	public boolean isMarried() {
		return married;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setMarried(boolean married) {
		this.married = married;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", address=" + address + ", age="
				+ age + ", married=" + married +"]"+"\n";
	}
	
	
	
	
	
	
	

}
