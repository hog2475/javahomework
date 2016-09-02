package java0713;

public class Chap3Operation {

	public static void main(String[] args) {

		char c = 'Z';
		// TODO boolean 타입의 변수 b를 선언하고 c가 대문자인지 파악하는 연산을 실행해서 결과를 할당하고
		// 출력하시오.
		
		boolean b =(int)c >= 65 && (int)c <= 90;
		System.out.println(b);
		int fahrenheit = 100;
		// TODO 위 화씨를 섭씨로 변경해서 출력하시오. celcius = 5/9 * (fahrenheit - 32)
		float celcius;
		celcius = ((float)5/(float)9) *(float) (fahrenheit - 32);
		System.out.println("섭씨 : " + celcius);
	}
}
