import java.io.*;
import java.util.*;
 
public class PirateTalk 
{
   // This lab has got to be the stupidest thing I've done for this class
   // They could have been a better way to teach HashMap usage to the skids and idiots in my class without something this dumb
   // oberle (or whoever wrote the rest of this crap) doesnt know the first thing about code readability, although I can't be talking because I put these useless comments here myself

   // I just realized that I've been spelling the guy's name wrong (orble instead of oberle) all this time
      
   private Map<String, String> englishToPirate;		


   public PirateTalk()
   {
      englishToPirate = new HashMap();	
   }
   

   public void initialize() throws IOException
   {
      int numWords = filesScanner.getFileSize("english.txt");
      String[] englishWords = new String[numWords];
      String[] pirateWords = new String[numWords];
      filesScanner.readFile(englishWords, "english.txt");
      filesScanner.readFile(pirateWords, "pirate.txt");
      for(int i=0; i<numWords; i++)
         englishToPirate.put(englishWords[i], pirateWords[i]);
   }
   
   public String toString()
   {
      String ans = "";
      // Iterator it=englishToPirate.keySet().iterator();
      // while(it.hasNext())
      // {
         // String englishWord = ""+it.next();
         // String pirateWord = ""+englishToPirate.get(englishWord);
         // ans+=englishWord+":"+pirateWord+"\n";	
      // }
      for(String englishWord: englishToPirate.keySet())
      {  
         String pirateWord = englishToPirate.get(englishWord);
         ans += (englishWord + ":" + pirateWord+"\n");
      }
      return ans;
   }

   public String clean(String word)
   {
      word=word.trim();
      int first;
      for(first=0; first<word.length(); first++)
         if(Character.isLetterOrDigit(word.charAt(first)))
         {
            word = word.substring(first);
            break;     
         }
      if (first == word.length())
         return null;
      int last;
      for(last=word.length()-1; last>=0; last--)
         if(Character.isLetter(word.charAt(last)))
         {
            word = word.substring(0, last+1);
            break;     
         }
      return word;
   }

/*******************************************************************************************
WRITE THE METHODS BELOW
*******************************************************************************************/


//post:  returns the pirate equivalent of the English word.
//			if the word is in the Map englishToPirate, return it's pirate equivalent
//			otherwise, use the following rules:
//		   if the word ends with "ing", return the word as ending with "in-"
//			i.e. "rowing" is returned as "rowin-"
//			drop all your 'v' characters and replace them with a '-'.
//			i.e. "over" is returned as "o-er"
//			if the word meets neither of the above cases, return the same word

// Holy shit oberle, ANNOTATIONS exist for a REASON!

   public String getWord(String word)
   {
      word = clean(word);
   
      if(englishToPirate.containsKey(word)){
         word = englishToPirate.get(word);
      }
      else{
         if(word.endsWith("ing")){
            word = word.substring(0, word.length() - 1) + "-";
         }
         word.replace("v", "-");
      }
      
      return word;
   }

//post:  will return a map whose keySet is comprised of all the unique pirate words
//			and whose values are ArrayLists of all the english words that mapped to that particular pirate word.
//i.e.   one such Map element might have a key of "ahoy" and a value ["hello", "hi", "greetings"]
//			another element might have the key "there" and the value ["thar"] 

   public Map<String, ArrayList<String>> flip()
   {
      Map<String, ArrayList<String>> ans = new TreeMap();

      for(Map.Entry<String, String> entry : englishToPirate.entrySet()){
         ArrayList<String> entries = new ArrayList<String>();
         entries.add(entry.getKey());

         ans.put(entry.getValue(), entries);
      }
   
      return ans;
   }

}