package java0713;


public class Chap04Control {

	public static void main(String[] args) {
		// TODO 01 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		int sum = 0;
		for(int i = 0; i <21 ; i++){
			if( ( i%2 !=0) && (i%3!=0))
				sum += i;
		}
		System.out.println("result - " + sum);

		// TODO 02. boolean 타입의 변수 b를 선언하고 c가 대문자인지 파악하는 연산을 실행해서 결과를 할당하고
		// 출력하시오.
		char c = 'z';
		boolean b = false;
		if((int)c >= 65 && (int)c <= 90)
			b = true;
		else if((int)c >= 97 && (int)c <= 122)
			b = false;
		System.out.println(b);
		// TODO 03. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오 .
		for(int i = 1; i <=6;i++)
			for(int j = 1 ; j <= 6; j++){
				if(i+j == 6)
					System.out.print(i+", "+j+"\t");
			}
		System.out.println();
		// TODO 04. 삼항 연산자를 이용해서 idx가 짝수인지 홀수인지 출력하시오.
		int idx = 5;
		String str;
		str = (idx%2==0)?"짝수입니다":"홀수입니다";
		System.out.println("idx : "+str);
		// TODO 05. int형 변수 inx가 10보다 크고 20보다 작을 때 true인 조건식으로 if 문의 true 항목을
		// 대체하시오.
		int inx = 15;
		if (inx > 10 && inx <20) {
			System.out.println("inx -- true");
		}
		// TODO 06. char형 변수 ch가 공백이나, 탭이 아닐 때 true인 조건식으로 if 문의 true 항목을 대체하시오.
		char ch1 = ' ';
		if (!(ch1 == ' ' || ch1 == '\t')) {
			System.out.println("ch1 -- true");
		}
		// TODO 07 char형 변수 ch가 ‘x’ 또는 ‘X’일 때 true인 조건식으로 if 문의 true 항목을 대체하시오.
		char ch2 = 'x';
		if (ch2 == 'x'|| ch2=='X') {
			System.out.println("ch2 -- true");
		}
		// TODO 08. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식으로 if 문의 true 항목을 대체하시오.
		char ch3 = '0';
		if ((int)ch3 >=48 && (int)ch3 <= 57) {
			System.out.println("ch3 -- true");
		}
		// TODO 09. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식으로 if 문의 true 항목을 대체하시오.
		char ch4 = 'Z';
		//a = 97
		//z = 122
		//A = 65
		//Z = 90
		System.out.println("ch4: "+(int)ch4);
		if (((int)ch4 >= 65 && (int)ch4 <= 90) //대문자 판단
				|| ((int)ch4 >= 97 && (int)ch4 <= 122)  //소문자 판단
				) {
			System.out.println("ch4 -- true");
		}
		// TODO 10. int형 변수 year가 400으로 나눠 떨어지거나, 또는 4로 나눠 떨어지고 100으로 나눠 떨어지지 않을 때 true인 if 문의 true 항목을 대체하시오.
		int year = 400;
		if (year%400 == 0 || (year%4==0 && year%100 !=0)) {
			System.out.println("year -- true");
		}
		// TODO 11. boolean형 변수 powerOn가 false일 때 true인 조건식으로 if 문의 true 항목을 대체하시오.
		boolean powerOn = false;
		if (!powerOn) {
			System.out.println("powerOn -- true");
		}

	}

}
