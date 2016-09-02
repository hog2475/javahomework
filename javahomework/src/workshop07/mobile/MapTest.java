package workshop07.mobile;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Mobile> map = new HashMap<String,Mobile>();
		double sum = 0.0;
		
		Mobile mob1 = new Mobile("LU6800","Optmus 2X",800000);
		Mobile mob2 = new Mobile("SU6600","Optmus Black",900000);
		Mobile mob3 = new Mobile("KU5700","Optmus Big",700000);
		Mobile mob4 = new Mobile("SU7600","Optmus Mach",950000);
		map.put("LU6800", mob1);
		map.put("SU6600", mob2);
		map.put("KU5700", mob3);
		map.put("SU7600", mob4);
		Set<String> set = map.keySet();
		
		for(String m : set){
			System.out.println(map.get(m).printInfo());
			sum +=map.get(m).price;
		}
		System.out.println("합계 : "+sum);
		
		for(String m : set){
			map.get(m).price = map.get(m).price *1.1;
			map.get(m).price = Math.round(map.get(m).price);
		}
		sum = 0.0;
		for(String m : set){
			System.out.println(map.get(m).printInfo());
			sum +=map.get(m).price;
		}
		System.out.println("합계 : "+sum);
	
	}

}
