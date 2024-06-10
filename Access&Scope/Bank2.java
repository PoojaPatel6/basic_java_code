class CheckingAccount{
    public String name;
    private int balance;
    private String id;
    
    public CheckingAccount(String inputName, int inputBalance, String inputId){
      name = inputName;
      balance = inputBalance;
      id = inputId;
    }
    
    public int getBalance(){
      return this.balance;
    }
  
    public void setBalance(int newBalance){
      this.balance = newBalance;
    }
      
  }
  public class Bank2{
    public static void main(String[] args){
      CheckingAccount accountOne = new CheckingAccount("Zeus", 100, "1");
      CheckingAccount accountTwo = new CheckingAccount("Hades", 200, "2");
      System.out.println(accountOne.getBalance());
      accountOne.setBalance(5000);
      System.out.println(accountOne.getBalance());
    }
  }
