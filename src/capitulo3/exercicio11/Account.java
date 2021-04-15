package capitulo3.exercicio11;

/**
 * @author Augusto Loose Bellinaso
 */
public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    //método para depositar
    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
        }
    }

    public void withdrawal(double withdrawalAmount) {
        if (withdrawalAmount > balance) {
            System.out.println("Withdrawal amount exceeded account balance!");
        } else {
            balance -= withdrawalAmount;
        }


    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
