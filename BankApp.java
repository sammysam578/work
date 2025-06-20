class Account {
    double calculateInterest() {
        return 0;
    }
}

class SavingsAccount extends Account {
    double calculateInterest() {
        return 500.0;
    }
}

class FixedDepositAccount extends Account {
    double calculateInterest() {
        return 2000.0;
    }
}

public class BankApp {
    public static void main(String[] args) {
        Account acc = new FixedDepositAccount();
        System.out.println("Interest: " + acc.calculateInterest());
    }
}
