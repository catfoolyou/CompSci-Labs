import java.util.*;

public class Prime{
   public static void main(String[] args){      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a non-negative number (0 to exit): ");
      int num = input.nextInt();
      while(num != 0){
         if(num < 0){
            System.out.println("Error: number cannot be negative");
            System.out.println("Enter a non-negative number (0 to exit): ");
            num = input.nextInt();
         }
         if(num > 0){
            System.out.print("The prime factors of " + num + " are: ");
            for(int i = 2; i < num; i++){
               while(num % i == 0){
                  num /= i;
                  System.out.print(i + " ");                  
               }
               
            }
            if(num > 2) {
               System.out.println(num);
            }
            else{
               if(num == 2 || num == 1){
                  System.out.println(num);
               }
               else{
                  System.out.println("");
               }
            }           
            System.out.println("Enter a non-negative number (0 to exit): ");
            num = input.nextInt();
         } 
      }  
   }
}