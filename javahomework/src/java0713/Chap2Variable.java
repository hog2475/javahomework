package java0713;

public class Chap2Variable {
	public static void main(String[] args) {
		// TODO 01.지구에서 달까지의 거리를 저장할 변수를 선언하고 값을 할당하시오. 단위는 생략
		//지구에서 달까지의 거리 :38440000000km 
		long km = 38440000000l;
		// TODO 02."지구에서 달까지의 거리 : 값"의 형태로 출력하시오.
		System.out.println("지구에서 달까지의 거리: "+km+"km");
		// TODO 03. i1을 문자 형태로 출력하시오.
		int i1 = 70;
		System.out.println((char)i1);
		// TODO 04. c1을 숫자 형태로 출력하시오.
		char c1 = 'C';
		System.out.println((int)c1);
		// TODO 05. c1을 소문자로 출력하시오.
		System.out.println((char)(c1+32));
	}
}
