package Demo.java;

public class BankAccount {
	 int accountNumber;
	    String accountHolder;
	    double balance;
	public BankAccount(int accountNumber, String accountHolder, double balance) {
		// TODO Auto-generated constructor stub
		  this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	}
	 public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }

	    // Display account details
	    public void displayAccount() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Balance: " + balance);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccount ba = new BankAccount(12345, "Om Patil", 1000.0);
	        ba.deposit(500);
	        ba.withdraw(300);
	        ba.displayAccount();
	}

}
