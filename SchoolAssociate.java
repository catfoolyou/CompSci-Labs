public class SchoolAssociate{

   private int age;
   private String name;
   private String role = "School Associate";

   public SchoolAssociate(int a, String n){
      age = a;
      name = n;
   }
   
   public void setRole(String newRole){
      role = newRole;
   }

   public String toString(){
      return("Name: " + name + ", Age: " + age + ", Role: " + role);
   }
}