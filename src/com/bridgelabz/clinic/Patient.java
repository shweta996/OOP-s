package com.bridgelabz.clinic;


public class Patient {
	private String name;
	private int id;
	private String mobNumber;
	private int age;
	
	public Patient(){}
	public Patient(String name, int id, String mobNum, int age){
		this.setName(name);
		this.setId(id);
		this.setMobNumber(mobNum);
		this.setAge(age);
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-15s %-10d  %-15s %15d\n", name, id, mobNumber, age));
		return sb.toString();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(String moNumber) {
		this.mobNumber = moNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}