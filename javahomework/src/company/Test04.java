package company;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company com = new Company(100);
		System.out.println("연 기본급 합: "+com.getIncome()+" 세후: "+com.getAfterTaxIncome());
		System.out.println("연 보너스 합: "+com.getBonus()+" 세후: "+com.getAfterTaxBonus());
		System.out.println("연 지급액 합: "+(com.getAfterTaxIncome()+com.getAfterTaxBonus()));
	}

}
