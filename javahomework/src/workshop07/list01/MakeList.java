package workshop07.list01;

import java.util.ArrayList;

public class MakeList {
	ArrayList<Integer> list;
	public MakeList() {
		list = new ArrayList<Integer>();
	}
	void makeArrayList(int size){
		for(int i = 0; i < size; i++){
			int value = (int)(Math.random()*9+10);
			list.add(value);
		}
	}
	double getAverage(){
		double avg = 0;
		for(int i = 0;i< list.size();i++)
			avg+=list.get(i);
		avg = avg/list.size();
		return avg;
	}
	ArrayList getList(){
		return list;
	}
}
