public class K12Student extends Student{

   private int grade;

   public K12Student(int a, String i, String n, int g){
      super(a, i, n);
      grade = g;
      setRole("K - 12 Student");
   }

   public String toString(){
      return(super.toString() + " Grade level: " + grade);
   }
}