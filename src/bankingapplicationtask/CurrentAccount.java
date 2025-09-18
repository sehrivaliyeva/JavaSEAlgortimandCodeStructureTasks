package bankingapplicationtask;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (overdraftLimit >= amount && balance != 0 && amount < balance) {
            balance -= amount;
            overdraftLimit -= amount;
        } else {
            try {
                throw new InsufficientBalanceException("kifayet qeder balansiniz yoxdur");
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    void displayAccountInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + "CurrentAccount{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
