public class Student extends SchoolAssociate{

   private int id;

   public Student(int a, int i, String n){
      super(a, n);
      id = i;
      setRole("Student");
   }

   public String toString(){
      return(super.toString() + " ID #: " + id);
   }
}