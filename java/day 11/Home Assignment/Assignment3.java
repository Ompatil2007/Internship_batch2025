// Base class
class BankAccount {
    String accountHolder;
    String accountNumber;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }
}

// Derived class
class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountHolder, String accountNumber, double interestRate) {
        super(accountHolder, accountNumber);
        this.interestRate = interestRate;
    }

    void displayDetails() {
        super.displayDetails(); // Call base method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
    class Assignment3{

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Om Patil", "SB123456", 4.5);
        sa.displayDetails(); // Call method
    }
}
