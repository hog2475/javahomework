package account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account("441-0290-1203",500000,7.3);
		System.out.println("계좌정보: "+acc.account+" 현재잔액: "+acc.balance);
		acc.withdraw(600000);
		acc.deposit(20000);
		System.out.println("계좌정보: "+acc.account+" 현재잔액: "+acc.balance);
		System.out.println("이자: "+acc.calculateInterest());
	}
}
