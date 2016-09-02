package workshop07.ship;

public class Cruise extends Ship{
	public Cruise() {
		// TODO Auto-generated constructor stub
	}
	public Cruise(String shipName,int fuelTank) {
		super(shipName, fuelTank);
	}
	@Override
	void sail(int dist) {
		// TODO Auto-generated method stub
		fuelTank -= dist*13;
	}
	@Override
	void refuel(int fuel) {
		// TODO Auto-generated method stub
		fuelTank += fuel*8;
	}
}
