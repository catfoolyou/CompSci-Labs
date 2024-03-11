public class Student implements Comparable<Student>{

   private double gpa;
   private String name;

   public Student(String n, double g){
      gpa = g;
      name = n;
   }
   
   public double getGPA(){
      return gpa;
   }
   
   public String toString(){
      return(name + " GPA: " + gpa);
   }
   
   public int compareTo(Student s){
      return Double.valueOf(gpa).compareTo(s.getGPA());
   }

}