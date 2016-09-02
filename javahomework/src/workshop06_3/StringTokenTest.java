package workshop06_3;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "4,2,3,6,7";
		StringTokenizer tokens = new StringTokenizer(str,",");
		int sum = 0;
		while(tokens.hasMoreTokens()){
			int value = Integer.parseInt(tokens.nextToken());
			sum +=value;
		}
		System.out.println(sum);
	}

}
