package account;

public class Account {
	String account; //계좌
	int balance;	// 잔액
	double interestRate;	//이율
	Account(){}
	Account(String account,int balance,double interestRate)
	{
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	double calculateInterest(){
		return balance*interestRate/100;
	}
	void deposit(int money){
		balance += money;
	}
	void withdraw(int money){
		if(balance >= money)
			balance -= money;
		else
			System.out.println("출금 할 수 없습니다.");
	}
}
