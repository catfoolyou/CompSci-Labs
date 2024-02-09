public class HighSchoolStudent extends K12Student{

   private int gpa;

   public HighSchoolStudent(int a, int i, String n, int g, int gp){
      super(a, i, n, g);
      gpa = gp;
      setRole("High School Student");
   }

   public String toString(){
      return(super.toString() + " GPA: " + gpa);
   }
}