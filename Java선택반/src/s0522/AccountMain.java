package s0522;

public class AccountMain {

	public static void main(String[] args) {
		Account a = new Account("이예섭", 78954,3000000);
		a.printInfo();
		a.입금(10000);
		a.입금(200000);
		a.출금(200000);
		a.출금(200000000);

	}

}
