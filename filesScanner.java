import java.io.*;
import java.util.*;
 //I am not stupid and I know how file IO works 
 // Typical case of YGBSM

 //the d in d.oberle stands for 'deevis' - lax1dude or buff or somebody
public class filesScanner
{
   public static int getFileSize(String fileName)throws IOException
   {
      Scanner input = new Scanner(new FileReader(fileName));
      int size = 0;
      while (input.hasNextLine())
      {
         size++;					
         input.nextLine();		
      }
      input.close();	
      return size;
   }

   public static void readFile(String[] words, String fileName)throws IOException
   {
      Scanner input = new Scanner(new FileReader(fileName));
      int i = 0;							
      String line;	
      while (input.hasNextLine())	
      {
         line = input.nextLine();		
         words[i] = line;				
         i++;								
      }
      input.close();						
   }

   public static void showArray(String[] words)
   {
      for (int i = 0; i < words.length; i++)
         System.out.println(words[i] + " ");
      System.out.println();
      System.out.println("Size of array:" + words.length);
   }

   public static void main(String argv[])throws IOException
   {
      int size = getFileSize("testFile.TXT");
      String[] list = new String[size];		
      readFile(list, "testFile.TXT");				
      showArray(list);
   }
}