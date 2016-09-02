package workshop07.ship;

public class Boat extends Ship{
	public Boat() {
		// TODO Auto-generated constructor stub
	}
	public Boat(String shipName,int fuelTank){
		super(shipName, fuelTank);
	}
	@Override
	void sail(int dist) {
		// TODO Auto-generated method stub
		fuelTank -= dist*10;
	}
	@Override
	void refuel(int fuel) {
		// TODO Auto-generated method stub
		fuelTank += fuel*10;
	}
	

}
