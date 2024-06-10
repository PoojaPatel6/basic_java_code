 class CheckingAccount1 {
    private String name;
    private int balance;
    private String id;

    public CheckingAccount1(String inputName, int inputBalance, String inputId) {
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    public void addFunds(int fundsToAdd) {
        balance += fundsToAdd;
    }

    public void getInfo() {
        System.out.println("This checking account belongs to " + name + ". It has " + balance + " dollars in it.");
    }

    // Getter methods for private fields
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }
}

public class Bank1 {
    public static void main(String[] args) {
        CheckingAccount1 accountOne = new CheckingAccount1("Zeus", 100, "1");
        CheckingAccount1 accountTwo = new CheckingAccount1("Hades", 200, "2");
        
        // Use getter method to access the private field 'name'
        System.out.println(accountOne.getName());
        
        accountOne.addFunds(5);
        accountOne.getInfo();
    }
}
