public class SchoolAssociateTester{ // rewritten 
   public static void main(String[] args){
      SchoolAssociate[] people = new SchoolAssociate[9];
      people[0] = new SchoolAssociate(42, "Carlos Duarte");
      people[1] = new Staff(36, 10, 45000, "Mike Kelley");
      people[2] = new Admin(40, 8, 75000, "John Bingham", "English", "Social Studies");
      people[3] = new Teacher( 42, 20, 55000, "Jerry Dotson", "Geometry");
      people[4] = new Professor(59, 30, 84000, "J. J. Brickley", "Digital Systems", "Daniels Hall 322", true);
      people[5] = new Student(7, "2984765", "Courtney Brooks");
      people[6] = new K12Student(10, "2568583", "Gilbert Liriano", 4);
      people[7] = new HighSchoolStudent(18, "1335685", "Bobby Riggs", 12, 4.332);
      people[8] = new CollegeStudent(19, "436482690247", "Michelle Wahome", 3.688, "English", "Undergrad");
      
      for (SchoolAssociate person: people){
         System.out.println(person);
      }  
   }
}