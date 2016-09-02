package workshop07.list03;

import java.util.ArrayList;

public class ListTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i <10;i++){
			int x = (int)(Math.random()*9+1);
			list1.add(x);
			int y = (int)(Math.random()*9+1);
			list2.add(y);
		}
		System.out.println("첫번째 ArrayList \t 두번째 ArrayList \t 결과");
		for(int i = 0 ; i < list1.size();i++){
			try{
			int value = list1.get(i)/list2.get(i);
			System.out.println(list1.get(i)+"------------"+list2.get(i)+"\t"
					+value);
			}catch (ArithmeticException e) {
				System.out.println(list1.get(i)+"------------"+list2.get(i)+"\t"
						+"분모가 0입니다.");
			}
		}

	}

}
