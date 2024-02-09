public class Admin extends Staff{

   private String dep1, dep2;

   public Admin(int a, int y, int s, String n, String d1, String d2){
      super(a, y, s, n);
      dep1 = d1;
      dep2 = d2;
      setRole("Administrator");
   }

   public String toString(){
      return(super.toString() + " Oversees " + dep1 + " and " + dep2);
   }
}