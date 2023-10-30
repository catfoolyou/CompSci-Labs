import java.io.*;
import java.util.*;

public class Babbage{

   public static Scanner input = new Scanner(System.in);
   
   public static void getSalary(){
      double salary, hours, tax, total;
      System.out.println("Enter salary per hour:");
      salary = input.nextDouble();
      while (salary < 0){
         System.out.println("That is an invalid amount. Please enter a positive value:");
         salary = input.nextDouble();
      }
      System.out.println("Enter the tax:");
      tax = input.nextDouble();
      while (tax > 100 || tax < 0){
         System.out.println("That is an invalid amount. Please enter a percentage between 0 and 100:");
         tax = input.nextDouble();
      }
      hours = 0;
      for(int i = 0; i < 4; i++){
         System.out.println("Enter hours worked this week:");
         hours += input.nextDouble();
         while (hours < 0 || hours > 168){
          System.out.println("That is an invalid amount. Please enter a possible value:");
            hours += input.nextDouble();
         }
      }   
      total = (salary*hours) * ((100-tax)/100);
      System.out.println("You earned $" + total + " this month");
   }
   
   public static void main(String args[]){
      getSalary();
   }
}