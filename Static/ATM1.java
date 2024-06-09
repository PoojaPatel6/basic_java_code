public class ATM{
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;
  
    // Instance variables
    public int money;
  
    public ATM(int inputMoney){
      this.money = inputMoney;
  
      // Steps 1 and 2: Edit numATMs and total money here
          numATMs += 1;
      totalMoney += inputMoney;
    }
  
    public void withdrawMoney(int amountToWithdraw){
      if(amountToWithdraw <= this.money){
        this.money -= amountToWithdraw;
        // Step 3: Edit totalMoney here
          totalMoney -= amountToWithdraw;
      }
    }
  
    public static void main(String[] args){
  
      System.out.println("Total number of ATMs: " + ATM.numATMs); 
      ATM firstATM = new ATM(1000);
      ATM secondATM = new ATM(500);
      System.out.println("Total number of ATMs: " + ATM.numATMs); 
  
      System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);  
      firstATM.withdrawMoney(500);
      secondATM.withdrawMoney(200);
      System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);    
  
  
  
    }
  
  }