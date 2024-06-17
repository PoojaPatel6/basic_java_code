import java.util.Scanner;

class Account {
    int bal;

    Account(int b) {
        bal = b;
    }

    public synchronized boolean isSufficientBal(int wb) { // synchronized method

        if (bal > wb)
            return true;
        else
            return false;
    }

    public synchronized void withdraw(int wb) { // synchronized method
        if (isSufficientBal(wb)) {
            bal = bal - wb;
            System.out.println("withdrawl Successfully.");
            System.out.println("Current Bal is: " + bal);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}

class Customer implements Runnable {

    Account h1;
    String name;

    Customer(Account g1, String s1) {
        h1 = g1;
        name = s1;
    }

    public void run() {
        Scanner s1 = new Scanner(System.in);
        System.out.println(name + " Enter amount: ");
        int amt = s1.nextInt();

        h1.withdraw(amt); // Call the synchronized withdraw method
    }
}

class MultiT3 {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1, "Pooja");
        Customer c2 = new Customer(a1, "Anshi");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}