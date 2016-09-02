package workshop07.ship;

public abstract class Ship {
	String shipName;
	int fuelTank;
	public Ship() {
	}
	public Ship(String shipName,int fuelTank) {
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}
	abstract void sail(int dist);//운항
	abstract void refuel(int fuel);//주유
	public String toString(){
		return String.format("%s  \t  %d", shipName,fuelTank);
	}
}
