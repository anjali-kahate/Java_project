package com.anju.model;

public class student {
	private int id;
	private String prn;
	private String name;
	private String corse;
	private int age;
	private String address;
	
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id= id;
	}
	public String getPrn(){
		return prn;
	}
	public void setPrn(String prn) {
		this.prn= prn;
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getCorse(){
		return corse;
	}
	public void setCorse(String corse) {
		this.corse= corse;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address) {
		this.address= address;
	}

}
