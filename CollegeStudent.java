public class CollegeStudent extends Student{

   private int gpa;
   private String major, status

   public CollegeStudent(int a, int i, String n, int g, String m, String s){
      super(a, i, n);
      gpa = g;
      major = ma;
      status = s;
      setRole("College Student");
   }

   public String toString(){
      return(super.toString() + " GPA: " + gpa + " Major: " + m + " Status: " + s);
   }
}