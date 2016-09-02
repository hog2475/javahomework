package com.car;

public abstract class Car {
	String name;
	String engine;
	int oilTank;
	int oilSize;
	int distance;

	public Car() {
	}

	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
	this.name = name;
	this.engine = engine;
	this.oilSize = oilSize;
	this.oilTank = oilTank;
	this.distance = distance;
	}
	abstract void go(int distance);
	abstract void setOil(int oilSize);
	public String toString(){
		return name+"\t"+engine+"\t"+oilTank+"\t"+oilSize+"\t"+distance;
	}

}
