package com.car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car[] = new Car[2];
		L3 l3 = new L3("L3", "1500", 50, 25, 0);
		L5 l5 = new L5("L5", "2000", 70, 35, 0);
		car[0] = l3;
		car[1] = l5;
		System.out.println("vehicleName"+"\t"+"engineSize"+"\t"+"oilTank"+"\t"+
		"oilSize"+"\t"+"distance"+"\t"+"temperature");
		System.out.println("-----------------------------------------------------------------------------");
		for(Car c:car)
			System.out.println(c);
		System.out.println();
	
		//25씩 주유
		System.out.println("vehicleName"+"\t"+"engineSize"+"\t"+"oilTank"+"\t"+
				"oilSize"+"\t"+"distance"+"\t"+"temperature");
				System.out.println("-----------------------------------------------------------------------------");
		for(Car c:car){
			c.setOil(25);
			System.out.println(c);
		}
		System.out.println();
		
		//80씩 주행
		System.out.println("vehicleName"+"\t"+"engineSize"+"\t"+"oilTank"+"\t"+
				"oilSize"+"\t"+"distance"+"\t"+"temperature");
				System.out.println("-----------------------------------------------------------------------------");
		for(Car c:car){
			c.go(80);
			System.out.println(c);
		}

	}

}
