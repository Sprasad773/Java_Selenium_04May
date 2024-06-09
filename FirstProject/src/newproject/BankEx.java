package newproject;

public class BankEx {
	static int balance = 1000;
	public static void Greetings() {
		System.out.println("well come");
	}
	public void deposit(int amount) 
	{
		balance = balance + amount;
		System.out.println("deposit " + balance );
		System.out.println(balance );
	}
	public void deposit1(int amount) 
	{
		balance = balance * amount;
		System.out.println("deposit " + balance );
		System.out.println(balance );
	}
	public void withdrawl(int amount) {
		balance = balance - amount;
		System.out.println("withdrawl");
		System.out.println(balance);
	}
	public static void main(String[] args) {
		Greetings();
		BankEx ref1 = new BankEx();
	//	ref1.deposit(20);
		ref1.withdrawl(20);
		ref1.deposit1(2);
		
	}

}
