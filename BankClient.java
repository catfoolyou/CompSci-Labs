import java.text.*;

public class BankClient{
   private String Name, account, pin, balanceAsMoney;
   private double balance;

   public BankClient(String n, String p, double b){
      Name = n;
      pin = p;
      balance = b;
      
      setBalanceAsMoney();
      createAccountNum();
   }
   
   public BankClient(String n, String p){
      Name = n;
      pin = p;
      balance = 0;
      
      setBalanceAsMoney();
      createAccountNum();
   }
   
   public void createAccountNum(){
      account = String.valueOf((int)(Math.random() * 1000000));
      while (account.length() < 6){
         account = "0" + account;
      }
   }
   
   public void setBalanceAsMoney(){
      balanceAsMoney = NumberFormat.getCurrencyInstance().format(balance);
   }
   
   public String getBalance(){
      return balanceAsMoney;
   }
   
   public String getAccount(){
      return account;
   }
   
   public boolean checkAccount(String acc){
      return acc.equals(account);
   }
   
   public boolean pinCheck(String p){
      return p.equals(pin);
   }
   
   public void deposit(double in){
      balance += in;
      setBalanceAsMoney();
   }
   
   public boolean withdraw(double out){
      if (balance >= out){
         balance -= out;
         setBalanceAsMoney();
         return true;
      }
      else{
         return false;
      }
   }
   
   public String toString(){
      return Name + " \nAccount number: " + account + " \nBalance: " + balanceAsMoney;
   }
}