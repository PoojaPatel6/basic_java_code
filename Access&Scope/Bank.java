class CheckingAccount {
    private String name;
    private double balance;

    public CheckingAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}

public class Bank {
    private CheckingAccount accountOne;
    @SuppressWarnings("unused")
    private CheckingAccount accountTwo;

    public Bank() {
        accountOne = new CheckingAccount("Zeus", 100);
        accountTwo = new CheckingAccount("Hades", 200);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        // Using getter methods to access private variables
        System.out.println(bank.accountOne.getName());
        System.out.println(bank.accountOne.getBalance());
    }
}
