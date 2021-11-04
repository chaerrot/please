package evaluation;

class Banking {   
    String name, accountNumber;
    int balance;
    
    public Banking(String name, String accountNumber, int balance)
	{
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//입금
    public void deposit(int money) {
    	balance += money;
    	System.out.println(money +"원이 입금됨");
    }
    //출금하다
    public void withdraw(int money) {
    	if (balance >= money) {
    		balance -= money;
    		System.out.println("계좌에서 "+ money +"원이 출금됨");
    	}
    	else {
    		System.out.println("잔고가 부족해 출금불능");
    	}
    }
    //계좌조회
    public void showAccount() {
    	System.out.println("계좌주: "+ name);
    	System.out.println("계좌번호: "+ accountNumber);
    	System.out.println("잔고: "+ balance);
    }
}

public class BankingMain
{
	public static void main(String[] args)
	{
		Banking banking = new Banking("장동건", "123-45-67890", 10000);
        banking.deposit(5000);
        banking.withdraw(9000);
        banking.showAccount();
	}
}
