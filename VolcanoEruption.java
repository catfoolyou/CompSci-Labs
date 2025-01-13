import java.io.*;
import java.util.*;

public class VolcanoEruption{

   public static void main(String[] args) throws IOException{
      Scanner input = new Scanner(new FileReader("volcanodata.txt"));
      
      int size = input.nextInt();
      Volcano [] volcanoes  = new Volcano[size];

      for(int i = 0; i < size; i++){
         volcanoes[i] = new Volcano(input.next(), input.nextInt(), input.next());
      }

      eruption(volcanoes);
      volcanoesOnContinent(volcanoes, "N.America");
      numVolcanoesOver(volcanoes, 10500);
      getTallest(volcanoes);

      showVolcanoes(volcanoes);
     
   }
   
   public static void eruption(Volcano[] vArray){
      int random = new Random().nextInt(vArray.length);
      System.out.println("Volcano " + vArray[random].getName() + " has erupted");
   }
   
   public static int volcanoesOnContinent(Volcano[] vArray, String targetContinent){
      int count = 0;
   
      for(int i = 0; i < vArray.length; i++){
         if(vArray[i].getContinent() == targetContinent){
            count ++;
         }
      }

      return count;
   }

   public static int numVolcanoesOver(Volcano[] vArray, int targetHeight){
      int count = 0;
   
      for(int i = 0; i < vArray.length; i++){
         if(vArray[i].getHeight() > targetHeight){
            count ++;
         }
      }

      return count;
   }
   
   public static String getTallest(Volcano[] vArray){
      int currentHeight = 0;
      Volcano tallest = null;
   
      for(int i = 0; i < vArray.length; i++){
         if(vArray[i].getHeight() > currentHeight){
            currentHeight = vArray[i].getHeight();
            tallest = vArray[i];
         }
      }

      return tallest.getName();
   }
   
   
   
   
   
   
   //it might be helpful to have a method that displays the whole
   //array of Volcano objects for debugging purposes
   public static void showVolcanoes(Volcano[] vArray){
      for(int i = 0; i < vArray.length; i++){
         System.out.println(vArray[i].toString());
      }
   }
}