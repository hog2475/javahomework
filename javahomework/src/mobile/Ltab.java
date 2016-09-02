package mobile;

public class Ltab extends Mobile{

	public Ltab() {
	}
	public Ltab(String mobileName,int batterySize,String osType) {
		super(mobileName,batterySize,osType);
	}
	@Override
	int operate(int time) {
		batterySize-= time*10;
		return batterySize;
	}
	@Override
	int charge(int time) {
		batterySize+=time*10;
		return batterySize;
	}
	
}
