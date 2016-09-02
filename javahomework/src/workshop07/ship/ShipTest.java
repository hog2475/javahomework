package workshop07.ship;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship boat = new Boat("Boat01",500);
		Ship cruise = new Cruise("cruise01",1000);
		
		ArrayList<Ship> list = new ArrayList<Ship>();
		list.add(boat);
		list.add(cruise);
		
		System.out.println("shipName \t fuelTank");
		System.out.println("-----------------------------------");
		for(Ship s:list)
			System.out.println(s);
		System.out.println();
		
		System.out.println("10운항");
		for(Ship s:list)
			s.sail(10);
		System.out.println("shipName \t fuelTank");
		System.out.println("-----------------------------------");
		for(Ship s:list)
			System.out.println(s);
		
		System.out.println();
		System.out.println("50주유");
		for(Ship s:list)
			s.refuel(50);
		System.out.println("shipName \t fuelTank");
		System.out.println("-----------------------------------");
		for(Ship s:list)
			System.out.println(s);
		
		
		
		
	}

}
