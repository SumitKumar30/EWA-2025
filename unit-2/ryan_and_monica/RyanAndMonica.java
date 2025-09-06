package ryan_and_monica;

public class RyanAndMonica extends Thread {
    BankAccount account = new BankAccount();
    private String nameThread;
    int amount;
    public RyanAndMonica(String name, int amount) {
        this.nameThread = name;
        this.amount = amount;
    }

    @Override
    public void run() {
        // chech the balance
        for(int i = 0; i < 5; i++) {
             int balance  = account.getBalance();
            if(balance > amount) {
                System.out.println(this.nameThread + " is going to withdraw");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
                account.withdraw(amount);
                System.out.println(this.nameThread + " completes the withdrawal");
            } else {
                    System.out.println("Sorry, not enough balance for " + this.nameThread);
                }
        }
      
    }
}
