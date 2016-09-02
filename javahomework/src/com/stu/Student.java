package com.stu;

public class Student {
	String name;
	int age;
	int height;
	int weight;
	public Student(){}
	public Student(	String name,int age,int height,int weight){
		this.name =	name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	String studentInfo(){
		String str = getName()+"\t"+getAge()+"\t"+getHeight()+"\t"+getWeight();
		return str;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
