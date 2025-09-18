package bankingapplicationtask;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            balance += balance * (interestRate / 100);
            System.out.println("balansiniz ugurla artdi !!");
        } else {
            System.out.println("meblegi dogru qeyd edin !!");
        }
    }

    @Override
    void withdraw(double amount) {
        if (balance > amount && amount != 0) {
            balance -= amount;
            System.out.println("nagdlasdirma yerine yetirildi balansiniz :" + balance);
        } else {
            try {
                throw new InsufficientBalanceException("kifayet qeder balance yoxdur !");
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    void displayAccountInfo() {
        System.out.println(this);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + "SavingAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}


