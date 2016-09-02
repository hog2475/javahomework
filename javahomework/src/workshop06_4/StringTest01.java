package workshop06_4;

import java.util.StringTokenizer;

public class StringTest01 {

	public static void main(String[] args) {

		String str = "I am second to none";
		int nullcnt = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ' '){
				nullcnt++;
				System.out.printf("%c",str.charAt(i));
			}else{
				System.out.printf("%c ",str.charAt(i));
			}
		}
		System.out.println("문자개수: "+(str.length()-nullcnt));
		StringTokenizer tokens = new StringTokenizer(str, " ");
		int count = 0;
		while(tokens.hasMoreTokens())
		{
			System.out.printf("%s ",tokens.nextToken());
			count++;
		}
		System.out.println("단어개수: "+count);
	}

}
