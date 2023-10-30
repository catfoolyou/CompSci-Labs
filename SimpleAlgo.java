   import java.io.*;
   import java.util.*;
	
   public class SimpleAlgo
   {
      public static Scanner input = new Scanner(System.in);
      
      public static void circle() throws IOException
      {
      //FIRST, DEFINE THE VARIABLES THAT YOU WILL NEED
      //GIVE THEM NAMES THAT MAKE SENSE
         double radius,	//user inputed radius of a circle
            area,		//the area of a circle
            perimeter;	//perimeter of a circle
      
      //INPUT - ASK THE USER FOR DATA AND STORE IT INTO A VARIABLE
         System.out.println("Enter the radius of a circle:");
         radius = input.nextDouble();
      
      //PROCESS - HAVE THE COMPUTER DO THE WORK FOR YOU
         area = Math.PI * radius * radius;
         perimeter = 2 * Math.PI * radius;
      
      //OUTPUT - SHOW THE USER THE RESULTS OF THAT WORK
         System.out.println("The area of a circle with radius "+radius+" is "+area+".");  
         System.out.println("The perimeter  is " + perimeter + ".");
      }
   
      public static void altitude()
      {
      //THE ALTITUDE OF AN OBJECT DROPPED FROM 100 METERS is GIVEN BY 
      //alt = 100 - 4.9 * t * t WHERE t IS TIME IN SECONDS (must be less than 20).  
      //ASK FOR t AND FIND THE ALTITUDE.
      //EX. Enter the time in seconds: 2
      //The object is at 80.4 meters.
         double time, alt, velocity;
         System.out.println("Enter the time the object has been falling in seconds");
         time = input.nextDouble();
         alt = 100 - 4.9 * time * time;
         System.out.println("The object is at " + alt + " meters");
      }
   
      public static void temperature()
      {
      //WRITE A PROGRAM THAT CONVERTS FAHRENHEIT TO CELCIUS USING C = (5/9)*(F-32).
      //WATCH OUT FOR THE DIFFERENCE BETWEEN DIV AND DIVIDE.
      //EX. Enter the temperature in Fahrenheit: 212
      //The temperature in Celcius is 100.0 degrees.
        double f, c;
        System.out.println("Enter the temperature in Fahrenheit:");
        f = input.nextDouble();
        c = (0.55555555555555555555555556) * (f-32);
        System.out.println("The temperature in Celcius is " + c + " degrees.");
      
      }
   
      public static void pizza()
      {
      //THE COST OF MAKING A PIZZA, GIVEN LABOR AND RENT IS $1.20 REGARDLESS OF SIZE 
      //AND AN ADDITIONAL $0.05 * THE DIAMETER SQUARED.  FIND THE COST GIVEN THE DIAMETER.
      //EX. Enter the size of the pizza: 10
      //      The cost is $6.20
         double diameter, cost;
         System.out.println("Enter the size of the pizza:");
         diameter = input.nextDouble();
         cost = 1.2f + (0.05f * diameter);
         System.out.println("The cost is " + cost);          
      }
   
      public static void distance()
      {
      //THE DISTANCE TO SCHOOL IS 32 KILOMETERS.  
      //WRITE A PROGRAM THAT ASKS THE USER FOR AN AVERAGE SPEED IN KILOMETERS PER     
      //HOUR AND FIND THE TIME FOR THE TRIP IN MINUTES.
      //Ex. Enter the average speed: 88
      //   	The trip will take you 21.8 minutes
         double speed, time;
         System.out.println("Enter the average speed:");
         speed = input.nextDouble();
         time = 32/speed;
         System.out.println("The trip will take you " +  time + " minutes");
      }
   
   
      public static void divAndMod()
      {
      //THE USER ENTERS TWO INTS AND THE METHOD DISPLAYS THE RESULT OF DIV AND MOD.
      //Ex. Enter the first integer:  13
      //  	 Enter the second integer: 4
      //  		13 / 4 is 3
      //  		13 % 4 is 1
      // 		4 / 13 is 0
      // 		4 % 13 is 4
         double first, second;
         System.out.println("Enter the 1st integer:");
         first = input.nextDouble();
         System.out.println("Enter the 2nd integer:");
         second = input.nextDouble();
         System.out.println(first + " / " + second + " is " + (first/second));
         System.out.println(first + " % " + second + " is " + (first%second));
         System.out.println(second + " / " + first + " is " + (second/first));
         System.out.println(second + " % " + first + " is " + (second%first));
      }
   
   
      public static void volleyball()
      {
      //VOLLEYBALL TEAMS ARE SET TO 7 PLAYERS PER TEAM.  HAVE THE USER ENTER THE      
      //  NUMBER OF AVAILABLE PLAYERS AND THEN CALCULATE THE NUMBER OF TEAMS AND  
      //  PLAYERS LEFT OVER.
      //  Ex. Enter the number of players: 37
      //      There will be 5 teams with 2 left over.
         int players, teams, left;
         System.out.println("Enter the number of players:");
         players = input.nextInt();
         teams = players/7;
         left = players%7;
         System.out.println("There will be " + teams + " teams with " + left + " left over");      
      }
   
   
      public static void time()
      {
      //THE USER ENTERS A TIME IN MINUTES AND THE METHOD CALCULATES AND SHOWS THE 
      //   NUMBER OF HOURS AND MINUTES.
      //   Ex. Enter the number of minutes: 327
      //     	 This is 5:27
         int minutes, hours;
         System.out.println("Enter the number of minutes:");
         minutes = input.nextInt();
         hours = minutes/60;
         minutes = minutes%60;
         System.out.println("The time is " + hours + ":" + minutes);
      }
   
   
      public static void change()
      {
      //THE USER ENTERS AN AMOUNT OF CHANGE IN CENTS AND THE PROGRAM SHOWS THE NUMBER
      //   OF QUARTERS, DIMES, NICKLES AND PENNIES.
      //   Ex. Enter an amount of change in cents: 68
      //   	 Quarters: 2		Dimes: 1		Nickles: 1		Pennies: 3
         int quarters, dimes, nickels, pennies, cents;
         System.out.println("Enter an amount of change in cents:");
         cents = input.nextInt();
         quarters = cents/25;
         cents = cents%25;
         dimes = cents/10;
         cents = cents%10;
         nickels = cents/5;
         cents = cents%5;
         pennies = cents;
         System.out.println("Quarters: " + quarters + " Dimes: " + dimes + " Nickles: " + nickels + " Pennies: " + pennies);
      }
     
      public static void main(String argv[]) throws IOException
      {
         circle();
         altitude();
         temperature();
         pizza();
         distance();
         divAndMod();
         volleyball();
         time();
         change();
      }
   }