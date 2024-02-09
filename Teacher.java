public class Teacher extends Staff{

   private String sub;

   public Teacher(int a, int y, int s, String n, String subj){
      super(a, y, s, n);
      sub = subj;
      setRole("Teacher");
   }

   public String toString(){
      return(super.toString() + " Teaches: " + sub);
   }
}