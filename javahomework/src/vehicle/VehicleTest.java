package vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck car = new Truck(1000,100,5);
		System.out.println("최대적재중량 \t오일 \t탱크크기 \t잔여오일량 \t현재적재중량\t 연비");
		System.out.println("===============================================");
		System.out.println(car);
		System.out.println("50L 주유 후");
		car.addOil(50);
		System.out.println(car);
		System.out.println("50km 주행 후");
		car.moving(50);
		System.out.println(car);
		System.out.println("100kg 적재 후");
		car.addWeight(100);
		System.out.println(car);
		System.out.println("30km 주행 후 ");
		car.moving(30);
		System.out.println(car);
		
		System.out.println("요금: " + car.getCost(30)+"원");
		
	}

}
