import java.io.*;
import java.util.*;

/* A Set is simply a Collection in which duplicates are not allowed. 
In a Map, each element consists of a unique key and a value.

yes I knew that

things I can use for set (nothing else is allowed, this lab is dumb)
interface java.util.Set
-> boolean add(Object x);			//boolean for successful add
-> boolean contains (Object x);	//search for x in the Set
-> boolean remove (Object x);		//boolean for successful remove
-> int size();							//the number of elements
-> Iterator iterator();				//to traverse the set
-> Object[] toArray();				//copies Set objects into an array which is returned

class java.util.HashSet implements java.util.Set
no shit sherlock

things I can use for map (nothing else is allowed, this lab is dumb)
interface java.util.Map
-> Object put(Object key, Object value);	//adds unique key maped to value
-> Object get(object key);						//returns value associated with key
-> Object remove (Object key);				//returns value removed
-> int size();										//the number of elements
-> Set keySet();									//returns a set of all the keys
-> boolean containsKey(Object key);			//looks to see if key exists in the keyset									

class java.util.HashMap implements java.util.Map
yes this is obvious
class java.util.TreeMap implements java.util.Map
you wrote that in an above comment I deleted

orble (or whoever made this) needs to stop writing all of this garbage (nobody reads it anyways, PLEASE put it in lab directions instead)

who even formats the comments like this its god-awful and makes by eyes bleed
*/

public class SetAndMaps
{

//post:  this is dumb because they havent updated the things they teach since like java 4
   public static Set union(Set s1, Set s2)
   {
      Set ans = new HashSet();	
      // ans.addAll(s1);
      // ans.addAll(s2);
      for (Object elem : s1) {
         ans.add(elem);
      }
      for (Object elem : s2) {
         ans.add(elem);
      }
      return ans;
   }

//post: this will return only those elements common to both s1 and s2
   public static Set intersection(Set s1, Set s2)
   {
      Set ans = new HashSet();

      for (Object elem : s1) {
         if (s2.contains(elem)) {
            ans.add(elem);
         }
      }
      for (Object elem : s2) {
         if (s1.contains(elem)) {
            ans.add(elem);
         }
      }

      return ans;
   }

//post: this will return the elements of s1 that are not in s2
   public static Set difference(Set s1, Set s2)
   
   {
      Set ans = new HashSet();

      for (Object elem : s1) {
         if (!s2.contains(elem)) {
            ans.add(elem);
         }
      }

      return ans;
   }

//post:  this will return only those elements that are unique to s1 and unique to s2
//			also known as the opposite of intersection (think union - intersection)
   public static Set exclusion(Set s1, Set s2)
   {
      Set ans = new HashSet();

      for (Object elem : s1) {
         if (!s2.contains(elem)) {
            ans.add(elem);
         }
      }
      for (Object elem : s2) {
         if (!s1.contains(elem)) {
            ans.add(elem);
         }
      }
  
      return ans;
   }

   // Funny how everything else was piss-easy and this one actually isn't

//post:  will return a map whose keySet is comprised of all the values in m
//			and whose values are arrays of all the keys from m that mapped to that value
//i.e. if m is a treeMap of students (keys) and grades (values), then flip returns
//a TreeMap of grades (keys) and all the students who made that grade in an ArrayList (value)

   public static Map flip(Map<String, String> m)
   {
      Map<String, ArrayList<String>> ans = new TreeMap();
      
      for(Map.Entry<String, String> entry : m.entrySet()){
         ArrayList<String> entries = new ArrayList<String>();
         entries.add(entry.getKey());

         ans.put(entry.getValue(), entries);
      }
      

      // for (Object elem : m.keySet()) {
      //    ans.put(m.get(elem), );
      //    //ans.put(key, value)
      // }

      return ans;
   }

   public static void main(String[] arg)
   
   {
      Set<String> keyOfG = new TreeSet();
      keyOfG.add("G");
      keyOfG.add("Am");
      keyOfG.add("Bm");
      keyOfG.add("C");
      keyOfG.add("D");
      keyOfG.add("Em");
      keyOfG.add("F#m7dim5");
   
      Set<String> keyOfC = new TreeSet();
      keyOfC.add("C");
      keyOfC.add("Dm");
      keyOfC.add("Em");
      keyOfC.add("F");
      keyOfC.add("G");
      keyOfC.add("Am");
      keyOfC.add("Bm7dim5");
   
      System.out.println("Chords in the key of G:");
      System.out.println(keyOfG+"\n");
   //[Am, Bm, C, D, Em, F#m7dim5, G]
   
      System.out.println("Chords in the key of C:");
      System.out.println(keyOfC+"\n");
   //[Am, Bm7dim5, C, Dm, Em, F, G]
   
      Set theirU = union(keyOfG, keyOfC);
      System.out.println("The Union of chords between the keys of G and C:");
      System.out.println(theirU+"\n");
   //[C, D, F#m7dim5, F, G, Em, Bm7dim5, Dm, Bm, Am]
   
      Set theirI = intersection(keyOfG, keyOfC);
      System.out.println("The Intersection of chords between the keys of G and C:");
      System.out.println(theirI+"\n");
   //[C, G, Em, Am]
   
      Set theirD = difference(keyOfG, keyOfC);
      System.out.println("The Difference in chords between the keys of G and C:");
      System.out.println(theirD+"\n");
   //[D, F#m7dim5, Bm]
   
      theirD = difference(keyOfC, keyOfG);
      System.out.println("The Difference in chords between the keys of C and G:");
      System.out.println(theirD+"\n");
   //[F, Bm7dim5, Dm]
   
      Set theirE = exclusion(keyOfG, keyOfC);
      System.out.println("The Exclusion of chords between the keys of G and C:");
      System.out.println(theirE+"\n");
   //[D, F#m7dim5, F, Bm7dim5, Dm, Bm]
   
      Map<String, String> tm = new TreeMap();
      tm.put("Ginger", "C");
      tm.put("Scary", "A");
      tm.put("Posh", "B");
      tm.put("Sporty", "B");
      tm.put("Baby", "C");
      tm.put("MaryAnne", "B");
      tm.put("Samantha", "A");
      System.out.println("TreeMap of students (key) with their respective grades (value):");
      System.out.println(tm+"\n");
   //{Baby=C, Ginger=C, MaryAnne=B, Posh=B, Samantha=A, Scary=A, Sporty=B}
   
      Map<String, ArrayList<String>> byGrade = flip(tm);
      System.out.println("TreeMap of grades (key) with all the students who made that grade (value):");
      System.out.println(byGrade+"\n");
   //{A=[Samantha, Scary], B=[MaryAnne, Posh, Sporty], C=[Baby, Ginger]}
   }

}