public class Student extends SchoolAssociate{

   private String id;

   public Student(int a, String i, String n){
      super(a, n);
      id = i;
      setRole("Student");
   }

   public String toString(){
      return(super.toString() + " ID #: " + id);
   }
}