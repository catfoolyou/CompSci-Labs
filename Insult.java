import java.io.*;
import java.util.*;
import java.util.Random;

public class Insult{

   public static int getFileSize(String fileName) throws IOException
   {
      Scanner input = new Scanner(new FileReader(fileName));
      int size=0;
      while (input.hasNextLine())
      {
         size++;
         input.nextLine();
      }
      input.close();
      return size;
   }
   
   public static void readFile(String[] words, String fName) throws IOException
   {
      Scanner input = new Scanner(new FileReader(fName));
      int i=0;
      String line;
      while (input.hasNextLine())
      {
         line=input.nextLine();
         words[i]= line;
         i++;
      }
      input.close();
   }
   
   public static void main(String argv[]) throws IOException
   {        
      int size = getFileSize("names.txt");
      String[] names = new String[size];
      readFile(names, "names.txt");
      
      int siz = getFileSize("verbs.txt");
      String[] verbs = new String[siz];
      readFile(verbs, "verbs.txt");
      
      int si = getFileSize("adj.txt");
      String[] adj = new String[si];
      readFile(adj, "adj.txt");
      
      int s = getFileSize("nouns.txt");
      String[] nouns = new String[s];
      readFile(nouns, "nouns.txt");
      
      System.out.println("Cringe generator v1.05 by me\n\nToday's daily cringy insult is:");      
      Random rand = new Random();
      
      System.out.println(names[rand.nextInt(names.length)] + verbs[rand.nextInt(verbs.length)] + adj[rand.nextInt(adj.length)] + nouns[rand.nextInt(nouns.length)]);
      
   }
}