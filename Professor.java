public class Professor extends Teacher{

   private String office;
   private boolean tenure;

   public Professor(int a, int y, int s, String n, String subj, String o, boolean t){
      super(a, y, s, n, subj);
      office = o;
      tenure = t;
      setRole("Professor");
   }

   public String toString(){
      return(super.toString() + " Office: " + office + " Tenured: " + tenure);
   }
}