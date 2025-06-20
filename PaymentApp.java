abstract class PaymentMethod {
    abstract void validate();
    abstract void processPayment(double amount);
}

class CreditCard extends PaymentMethod {
    void validate() { System.out.println("Validating Credit Card..."); }
    void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class PayPal extends PaymentMethod {
    void validate() { System.out.println("Validating PayPal..."); }
    void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal");
    }
}

class BankTransfer extends PaymentMethod {
    void validate() { System.out.println("Validating Bank Transfer..."); }
    void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Bank Transfer");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        PaymentMethod payment = new CreditCard();
        payment.validate();
        payment.processPayment(5000.0);
    }
}
