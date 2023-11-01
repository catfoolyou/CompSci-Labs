public class Player2{
   private String name;
   private int money;
   
   public Player2(String n){
      money = 100;
      name = n;
   }
   
   public String getName(){
      return name;
   }

   public int getMoney(){
      return money;
   }
   
   public void setMoney(int i){
      money = i;
   }
   
   public String toString(){
      return name + ", you have " + money + " coins left.";
   }
}