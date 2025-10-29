

// ---- Abstraction (contract)
interface Payment {
    void processPayment(double amount);
}

// ---- Concrete implementations
class CreditCardPayment implements Payment {
    @Override public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}
class CashPayment implements Payment {
    @Override public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " in Cash");
    }
}
class UPIPayment implements Payment {
    @Override public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}


public class LooseShoppingDemo {
    public static void main(String[] args) {
        System.out.println("\n--- Loose Coupling Demo ---");

        // pretend this comes from user input / menu
        String userChoice = "UPI";   // try "CreditCard", "Cash", "UPI"

        // program to the INTERFACE
        Payment payment = PaymentPicker.pickPayment(userChoice);

        // rest of the code uses only the interface
        payment.processPayment(999.00);

        // want to switch? just change userChoice (or input) — no other code change
        userChoice = "CreditCard";
        payment = PaymentPicker.pickPayment(userChoice);
        payment.processPayment(499.00);
    }
}

// very basic helper, NOT a design-pattern lesson—just separating picking logic
class PaymentPicker {
    public static Payment pickPayment(String mode) {
        if ("CreditCard".equals(mode)) return new CreditCardPayment();
        if ("UPI".equals(mode))        return new UPIPayment();
        if ("Cash".equals(mode))       return new CashPayment();
        return new CashPayment();
    }
}
