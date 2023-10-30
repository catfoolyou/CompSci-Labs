import java.io.*;
import java.util.*;

public class Calculator{

   public static Scanner input = new Scanner(System.in);
   
   public static void add(){
      double one, two;
      System.out.println("Enter a number to add:");
      one = input.nextDouble();
      System.out.println("Enter another number to add:");
      two = input.nextDouble();
      System.out.println(one + " plus " + two + " is " + (one+two) + "\n\n");
   }
   public static void subtract(){
      double one, two;
      System.out.println("Enter a number to subtract:");
      one = input.nextDouble();
      System.out.println("Enter another number to subtract:");
      two = input.nextDouble();
      System.out.println(one + " minus " + two + " is " + (one-two) + "\n\n");
   }
   public static void multiply(){
      double one, two;
      System.out.println("Enter a number to multiply:");
      one = input.nextDouble();
      System.out.println("Enter another number to multiply:");
      two = input.nextDouble();
      System.out.println(one + " times " + two + " is " + (one*two) + "\n\n");
   }
   public static void divide(){
      double one, two;
      System.out.println("Enter a number to divide:");
      one = input.nextDouble();
      System.out.println("Enter another number to divide:");
      two = input.nextDouble();
      System.out.println(one + " divided by " + two + " is " + (one/two) + "\n\n");
   }
   public static void sqrt(){
      double one;
      System.out.println("Enter a number to get the square root of:");
      one = input.nextDouble();
      while (one < 0){
         System.out.println("Positive numbr pleas");
         one = input.nextDouble();
      }
      System.out.println("The square root of " + one + " is " + Math.sqrt(one) + "\n\n");
   }
   public static void sine(){
      double one;
      System.out.println("Enter a number to get the sine of:");
      one = input.nextDouble();
      System.out.println("The sine of " + one + " is " + Math.sin(one) + "\n\n");
   }
   public static void cos(){
      double one;
      System.out.println("Enter a number to get the cosine of:");
      one = input.nextDouble();
      System.out.println("The cosine of " + one + " is " + Math.cos(one) + "\n\n");
   }
   public static void tan(){
      double one;
      System.out.println("Enter a number to get the tangent of:");
      one = input.nextDouble();
      System.out.println("The tangent of " + one + " is " + Math.tan(one) + "\n\n");
   }
   public static void secant(){
      double one;
      System.out.println("Enter a number to get the secant of:");
      one = input.nextDouble();
      System.out.println("The secant of " + one + " is " + 1/(Math.sin(one)) + "\n\n");
   }
   public static void cosecant(){
      double one;
      System.out.println("Enter a number to get the cosecant of:");
      one = input.nextDouble();
      System.out.println("The cosecant of " + one + " is " + 1/(Math.cos(one)) + "\n\n");
   }
   public static void cotan(){
      double one;
      System.out.println("Enter a number to get the cotangent of:");
      one = input.nextDouble();
      System.out.println("The cotangent of " + one + " is " + 1/(Math.tan(one)) + "\n\n");
   }
   
   public static void main(String Args[]){
      int option = 1;
      while (option != 0){
         System.out.println("Choose an option: \n1) add\n2) subtract\n3) multiply \n4) divide\n5) square root \n6) sine\n7) cosine \n8) tangent\n9) cosecant \n10)secant\n11)cotangent \n0) quit");
         option = input.nextInt();
         while (!(option > -1 && option < 12)){
            System.out.println("That's not an option.");
            option = input.nextInt();
         }
         if (option == 1){
            add();
         }
         if (option == 2){
            subtract();
         }
         if (option == 3){
            multiply();
         }
         if (option == 4){
            divide();
         }
         if (option == 5){
            sqrt();
         }
         if (option == 6){
            sine();
         }
         if (option == 7){
            cos();
         }
         if (option == 8){
            tan();
         }
         if (option == 9){
            cosecant();
         }
         if (option == 10){
            secant();
         }
         if (option == 11){
            cotan();
         }
      }
      //crash(exit)  
   }
}