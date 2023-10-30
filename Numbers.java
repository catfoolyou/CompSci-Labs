import java.util.*;

public class Numbers{
   public static void main(String[] args){      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a number");
      int num1 = input.nextInt();
      System.out.println("Enter a number");
      int num2 = input.nextInt();
      System.out.println("Enter a number");
      int num3 = input.nextInt();
      System.out.println("Enter a number");
      int num4 = input.nextInt();
      System.out.println("Enter a number");
      int num5 = input.nextInt();
      
      int r1 = num1 + num2;
      int r2 = r1 * num3;
      int r3 = r2 - num4;
      int r4 = r3 / num5;
      
      System.out.println(num1+" + "+num2+" = "+r1);
      System.out.println(r1+" * "+num3+" = "+r2);
      System.out.println(r2+" - "+num4+" = "+r3);
      System.out.println(r3+" / "+num5+" = "+r4);      
   }
}