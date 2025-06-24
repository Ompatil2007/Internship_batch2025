class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit amount");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Invalid or insufficient balance");
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    void display() {
        System.out.println("Account No: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
    }
}

class Assignment6 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("BKID565866");
        b.deposit(100000);
        b.withdraw(50000);
        b.display();
    }
}
