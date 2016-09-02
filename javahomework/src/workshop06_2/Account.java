package workshop06_2;

public class Account {

	String account;	//계좌
	double balance; //잔액
	double interestRate; //이율
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String account, double balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	double calculateInterest(){
		return Math.round(balance*interestRate/1000)*10;
	}
	void deposit(double money) throws Exception{
		if(balance+ money < 0)
			throw new Exception();
		balance +=money;
		
	}
	void withdraw(double money) throws Exception{
		if(balance - money < 0 || money < 0)
			throw new Exception();
		balance -=money;
	}
	public String toString(){
		return String.format("Account(계좌번호): %s, balance(잔액): %f, interestRate(이율): %f %c",account,balance,interestRate,'%');
	}
}
