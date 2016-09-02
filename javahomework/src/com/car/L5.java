package com.car;

public class L5 extends Car implements Temp{
	
	public L5() {
	}
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
	super(name, engine, oilTank, oilSize, distance);
	}
	@Override
	void go(int distance) {
		oilSize -= distance/8;
		this.distance += distance;
	}
	@Override
	void setOil(int oilSize) {
		this.oilSize += oilSize;
	}
	@Override
	public int getTempGage() {
		return distance/5;
	}
	public String toString(){
		return super.toString()+"\t"+getTempGage();
	}

}
