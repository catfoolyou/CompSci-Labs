import java.util.*;
public class JuniorRecords{
   private ArrayList<Student> all = new ArrayList<Student>();
   private ArrayList<Student> marshals = new ArrayList<Student>();

   public JuniorRecords(){
   
   }
   
   public static void sort(ArrayList<Student> list){      
      for (int i = 1; i < list.size(); i++) {
         int j = i;
         Student insert = list.get(i);
         while (j > 0 && insert.compareTo(list.get(j - 1)) > 0) {
            list.set(j, list.get(j - 1));
            j--;
         }
         list.set(j, insert);
      }
   }
   
   public void addStudent(Student st){
      all.add(st);
      if((st.getGPA() > 3.75) && (marshals.size() < 10)){
         marshals.add(st);
      }
      sort(marshals);
   }
   
   public void printAll(){
      System.out.println("All students:\n");
      
      for(Student s : all)
         System.out.println(s);
         
   }
   
   public void printJuniorMarshals(){
      System.out.println("Junior marshals:\n");
      
      for(int i = 0; i < marshals.size(); i++){
         System.out.println("#" + (i + 1) + ": " + marshals.get(i));
      }
   }
}