package com.car;

public class L3 extends Car implements Temp{
	
	public L3() {
	}
	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
	super(name, engine, oilTank, oilSize, distance);
	}
	@Override
	void go(int distance) {
		oilSize-= distance/10;
		this.distance += distance;
	}
	@Override
	void setOil(int oilSize) {
		this.oilSize += oilSize;
	}
	@Override
	public int getTempGage() {
		
		return distance/10;
	}
	public String toString(){
		return super.toString()+"\t"+getTempGage();
	}
	

}
