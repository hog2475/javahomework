package vehicle;

public class Car extends Vehicle{
	double restOil = 0;
	int curWeight = 0;
	
	public Car() {
	}
	public Car(int maxWeight,double oilTankSize, double efficiency) {
	super(maxWeight,oilTankSize,efficiency);	
	}
	void addOil(int oil){
		if(restOil+oil>= oilTanksSize)
			restOil = oilTanksSize;
		else
			restOil+=oil;
	}
	void moving (int distance){
		if(restOil - distance * efficiency >=0)
			restOil = restOil - distance * efficiency;
		else
			System.out.println("연료가 부족합니다.");
	}
	void addWeight(int weight){
		if(curWeight+ weight <= maxWeight)
			curWeight += weight;
	}
	public String toString(){
		return super.toString()+" 잔여 오일량: "+restOil+" 현재 적재중량: "+curWeight;
	}
	public double getRestOil() {
		return restOil;
	}
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	public int getCurWeight() {
		return curWeight;
	}
	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
}
