package workshop06_1;

public class CalcTest {

	public static void main(String[] args) {
		
		if(args.length >3 || args.length <3){
			System.out.println("다시 입력하세요.");
			return ;
		}
		Calculator cal = new Calculator();
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[2]);
		double result = 0;
		switch (args[1]) {
		case "+":
			result =cal.plus(x, y);
			break;
		case "-":
			result =cal.minus(x, y);
			break;
		case "x":
			result =cal.multiplication(x, y);
			break;
		case "/":
			result =cal.divide(x, y);
			break;
		default:
			System.out.println("없는 연산자입니다.");
			break;
		}
		System.out.println("결과: "+result);
	}

}
