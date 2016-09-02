package workshop06_1;

public class Calculator {

	double plus(int a,int b){
		double value = a +b;
		return value;
	}
	double minus(int a,int b){
		double value = a - b;
		return value;
	}
	double multiplication(int a,int b){
		double value = a * b;
		return value;
	}
	double divide(int a,int b){
		double value =0;
		try{
		 value = a/ b;
		}catch (ArithmeticException e) {
			System.out.println("Exception 이  발생 하였습니다. 다시 입력해주세요.");
		}
		return value;
	}
}
