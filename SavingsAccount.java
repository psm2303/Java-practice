public class SavingsAccount {
  
  int balance;
  public void checkBalance(){
    System.out.println( "Hello! \n Your balance is " + balance);
  }
  public void deposit(int amountToDeposit){
    balance += amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);
  }
  public int withdraw(int amountToWithdraw){
    balance -= amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  
  }
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(200);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(500);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
   savings.deposit(500);
    
    //Check balance:
    savings.checkBalance();
    
  }       
}
