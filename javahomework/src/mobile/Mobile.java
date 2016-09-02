package mobile;

public abstract class Mobile {
	String mobileName;
	int batterySize;
	String osType;

	public Mobile() {
	}

	public Mobile(String mobileName, int batterySize, String osType) {
	this.mobileName = mobileName;
	this.batterySize = batterySize;
	this.osType = osType;
	}
	abstract int operate(int time);//사용
	abstract int charge(int time);//충전
	public String toString(){
		return mobileName+"\t"+batterySize+"\t"+osType;
	}
}
