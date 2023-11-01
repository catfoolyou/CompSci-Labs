public class SlotMachine{
   private int cost;
   private int multiplier;
   private int winnings;
   
   private SlotReel one = new SlotReel();
   private SlotReel two = new SlotReel();
   private SlotReel three = new SlotReel();
   
   
   public SlotMachine(int c){
      cost = c;
      multiplier = c/5;
   }
   
   public int getCost(){
      return cost;
   }
   
   public void pull(){
      one.spin();
      two.spin();
      three.spin();
   }
   
   private boolean hit3(){
      boolean hit = false;
      if((one.equals(two)) && (two.equals(three)) && (one.value != 4) && (one.value != 5)){
         hit = true;
      }
      else{
         hit = false;
      }
      return hit;
   }
   
   private boolean hit2(){
      if((one.value == 5) && one.equals(two)){
         return true;
      }
      else{
         return false;
      }
   }
   
   public String toString(){
      return one+"   "+two+"   "+three+"   \n"; //using \t gives different spaces
   }
   
   public int calculate(){
      winnings = 0;
      
      if(hit3()){
         if(one.value == 3){
            winnings = multiplier * 20;
         }
         else if(one.value == 1){
            winnings = multiplier * 30;
         }
         else if(one.value == 2){
            winnings = multiplier * 40;
         }
         else if(one.value == 6){
            winnings = multiplier * 50;
         }
      }
      else if(hit2()){
         if(three.value == 5){
            winnings = multiplier * 10;
         }
         else{
            winnings = multiplier * 5;
         }
      }
      else{
         winnings = 0;
      }
      return winnings;
   }
}