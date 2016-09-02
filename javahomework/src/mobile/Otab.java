package mobile;

public class Otab extends Mobile {

	public Otab() {
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	int operate(int time) {
		batterySize -= time*12;
		return batterySize;
	}

	@Override
	int charge(int time) {
		batterySize +=time*8;
		return batterySize;
	}
}
