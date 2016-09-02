package vehicle;

public class Vehicle {

	int maxWeight;
	double oilTanksSize;
	double efficiency;

	public Vehicle() {
	}

	public Vehicle(int maxWeight, double oilTanksSize, double efficiency) {
	this.maxWeight = maxWeight;
	this.oilTanksSize = oilTanksSize;
	this.efficiency = efficiency;
	}
	public String toString(){
		return "최대 적재량: "+maxWeight+" 오일탱크 크기: "+oilTanksSize;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getOilTanksSize() {
		return oilTanksSize;
	}

	public void setOilTanksSize(double oilTanksSize) {
		this.oilTanksSize = oilTanksSize;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	
}
