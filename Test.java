import java.util.*;

public class Test{
   public static void main(String[] args){      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter your full name");
      String name = input.nextLine();
      String[] names = name.split(" ");
      String firstName = names[0];
      String middleName = names[1];
      String lastName = names[2];

      System.out.println("Initials: " + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0));
      System.out.println("Rearranged name: " + lastName + " " + firstName + " " + middleName.charAt(0) + ".");
   }
}