abstract class Bank {
    abstract double getInterestRate();
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.2;
    }
}

class Assignment2 {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
    }
}
