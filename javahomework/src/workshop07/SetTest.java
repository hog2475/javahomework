package workshop07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set= new HashSet();
		if(args.length != 0){
		for(int i = 0; i < args[0].length();i++){
			set.add(args[0].substring(i, i+1));
		}
		System.out.println(set);
		}else
			System.out.println("이클립스 입력이 없습니다.");
	}

}
