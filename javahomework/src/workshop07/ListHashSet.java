package workshop07;

import java.util.ArrayList;
import java.util.HashSet;

public class ListHashSet {

	public static void main(String[] args) {

		int size = Integer.parseInt(args[0]);
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < size ; i++){
			int value = (int )(Math.random()*9+1);
			list.add(value);
		}
		for(int i = 0; i < size ; i++){
			int value = (int )(Math.random()*9+1);
			set.add(value);
		}
		System.out.println(list);
		System.out.println();
		System.out.println(set);
	}

}
