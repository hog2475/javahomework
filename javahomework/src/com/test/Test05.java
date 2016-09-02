package com.test;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int getData = 0;
		if(args.length == 0)
			System.out.println("데이터를 입력해주세요.");
		else{
			getData = Integer.parseInt(args[0]);
			if(!(getData >= 5 && getData <= 10))
				System.out.println("잘못 입력하셧습니다.");
		}
		Calc cal = new Calc();
		System.out.println("결과 : " + cal.calculaute(getData));
	}

}
