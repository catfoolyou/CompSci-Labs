import java.util.*;

public class Test2{
  public static void main(String Args[]){
      //1
      for(int i=1; i<=4; i++){
         for(int j=1; j<=9; j++){
            System.out.println("E"+i+"M"+j);
         }
      }
      //2
      for(int i=0; i<=32; i++){
         if(i<10){
            System.out.println("MAP0"+i);
         }
         else{
            System.out.println("MAP"+i);
         }
      }
  }
}