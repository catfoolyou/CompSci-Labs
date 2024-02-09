public class CollegeStudent extends Student{

   private double gpa;
   private String major, status;

   public CollegeStudent(int a, String i, String n, double g, String m, String s){
      super(a, i, n);
      gpa = g;
      major = m;
      status = s;
      setRole("College Student");
   }

   public String toString(){
      return(super.toString() + " GPA: " + gpa + " Major: " + major + " Status: " + status);
   }
}