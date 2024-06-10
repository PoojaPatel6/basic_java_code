 class CheckingAccount{
    private String name;
    private int balance;
    
    public CheckingAccount(String inputName, int inputBalance){
      name = inputName;
      balance = inputBalance;
    }
    
    @SuppressWarnings("unused")
    private void addFunds(int fundsToAdd){
      balance += fundsToAdd;
    }
  
    public void printBalance(){
      System.out.println("Account balance is " + balance);
    }
    
    @SuppressWarnings("unused")
    private void getInfo(){
      System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    }
  }

  public class Banks{
    public static void main(String[] args){
      @SuppressWarnings("unused")
    CheckingAccount accountOne = new CheckingAccount("Zeus", 100);
      @SuppressWarnings("unused")
    CheckingAccount accountTwo = new CheckingAccount("Hades", 200);
      CheckingAccount myAccount = new CheckingAccount("Mike", 300);
      myAccount.printBalance();  
    }
  }