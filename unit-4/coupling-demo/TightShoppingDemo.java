

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

// ---- TIGHTLY COUPLED demo
class TightShoppingDemo {
    public static void main(String[] args) {
        System.out.println("--- Tight Coupling Demo ---");

        // Client is hard-wired to a specific class:
        CreditCardPayment payment = new CreditCardPayment();
        payment.processPayment(150.75);

        // Want UPI instead? You must edit this file: --> this leads to changes in the main class --> No Seamless Integration --> Tight Coupling
        // UPIPayment payment = new UPIPayment();
        // payment.processPayment(150.75);
    }
}
