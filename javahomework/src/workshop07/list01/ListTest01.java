package workshop07.list01;

import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args == null)
			return ;
		try{
		if(args[0].equals(""))
			return ;
		}catch (ArrayIndexOutOfBoundsException e) {
			return;
		}
		int size = 0;
		try{
			size = Integer.parseInt(args[0]);
		}catch (NumberFormatException e) {
			e.getMessage();
		}
		MakeList mklist = new MakeList();
		mklist.makeArrayList(size);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = mklist.getList();
		for(Integer i:list)
			System.out.printf(i+"\t");
		System.out.println();
		System.out.println("평균: "+mklist.getAverage());
	}

}
