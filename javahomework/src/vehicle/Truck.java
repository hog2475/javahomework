package vehicle;

public class Truck extends Car{
	
	public Truck() {
	}
	public Truck(int maxWeight,double oilTankSize, double efficiency) {
		super(maxWeight,oilTankSize,efficiency);
	}
	double getEfficency(){
		double value = curWeight/5 *0.2;
		return efficiency - value;
	}
	public void moving(int distance){
		restOil = restOil- calcOil(distance);
	}
	double calcOil(int distance){
		double value = distance/getEfficency();
		return value;
	}
	int getCost(int distance){
		int cost;
		cost = (int)(calcOil(distance)*3000);
		return cost;
	}
	public String toString(){
		return super.toString()+" 연비: "+getEfficency();
	}
	
}
