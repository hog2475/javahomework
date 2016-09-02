package workshop06_2;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account("441-0290-1203",500000,7.3);
		System.out.println(acc);
		try{
		acc.deposit(-10);
		}catch (Exception e) {
			System.out.println("입금 금액이 0보다 적습니다.");
		}
		try{
		acc.withdraw(600000);
		}catch (Exception e) {
			System.out.println("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
		System.out.println(acc.calculateInterest());
	}

}
