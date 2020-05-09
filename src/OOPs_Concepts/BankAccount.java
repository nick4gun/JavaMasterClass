package OOPs_Concepts;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String customerName;
	private String customerEmailAddr;
	private String customerPhoneNumber;

	public BankAccount() {
		System.out.println("Empty constructor called");
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
	}

	public void withdrawal(double withdrawalAmount) {
		if (balance - withdrawalAmount < 0) {
			System.out.println("Only " + balance + " available. Withdrawal not processed");
		} else {
			balance -= withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + balance);
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return balance;
	}

	public void setAccountBalance(double accountBalance) {
		this.balance = accountBalance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailAddr() {
		return customerEmailAddr;
	}

	public void setCustomerEmailAddr(String customerEmailAddr) {
		this.customerEmailAddr = customerEmailAddr;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

} 
