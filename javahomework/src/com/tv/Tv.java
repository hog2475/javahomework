package com.tv;

public class Tv {

	String name;
	int price;
	String description;

	public Tv() {
	}

	public Tv(String name, int price, String description) {
	this.name = name;
	this.price = price;
	this.description = description;
	}
	public String toString(){
		return name+"\t"+price+"\t"+description;
	}

}
