public class Staff extends SchoolAssociate{

   private int years, salary;

   public Staff(int a, int y, int s, String n){
      super(a, n);
      years = y;
      salary = s;
      setRole("Staff");
   }

   public String toString(){
      return(super.toString() + " Salary: " + salary + ", Years Worked: " + years);
   }
}