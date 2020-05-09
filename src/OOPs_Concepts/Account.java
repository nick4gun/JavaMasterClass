package OOPs_Concepts;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount NikAccount = new BankAccount();
		NikAccount.withdrawal(100.0);

		NikAccount.deposit(50.0);
		NikAccount.withdrawal(100.0);

		NikAccount.deposit(50.0);
		NikAccount.withdrawal(60.0);
	}

}
