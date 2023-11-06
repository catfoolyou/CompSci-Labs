public class Player
{
   private final String name;
   private int currentSpace;
   
   public Player(String n)
   { currentSpace = 0; name = n; }
   
   public void setSpace(int s){
      currentSpace = s;
   }
      
   public String getName(){
      return name;
   }
   
   public int getSpace() { return currentSpace; }
   
   public String toString()
   { return this.name + " is on space " + this.currentSpace; }
   
   public boolean hasWon()
   { return (this.currentSpace >= 100); }
}