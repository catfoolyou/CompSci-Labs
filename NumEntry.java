public class NumEntry{
   private int value, frequency;
   
   public NumEntry(int val){
      value = val;
      frequency = 1;
   }
   
   public void recordCopy(){
      frequency++;
   }
   
   public int getValue(){
      return value;
   }
   
   public int getFrequency(){
      return frequency;
   }
   
   public String toString(){
      return "Value: " + value + ", Frequency: " + frequency;
   }
}