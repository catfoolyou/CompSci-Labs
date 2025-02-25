public class stackTest
{
   public static StackImpl<String> toStack(String word)
   {
      StackImpl<String> ans = new StackImpl();  
      for(int i=0; i<word.length(); i++)
         ans.push("" + word.charAt(i));
      return ans;
   }
   
   public static void main(String args[])
   {
      StackImpl<String> wordStack = new StackImpl();
      wordStack = toStack("Hello");
      while (!wordStack.isEmpty())
         System.out.println("Removing " + wordStack.pop() + " off of the top of the stack");
      
      
      StackImpl<String> books = new StackImpl();
      books.push("War & Peace");
      books.push("C++ for U++");
      books.push("Emma");
      books.push("Godel, Escher, Bach");
                   
      System.out.println();	
      System.out.println("The book on the top of the stack is " + books.peek());
      while (!books.isEmpty())
         System.out.println("Removing " + books.pop() + " off of the top of the stack");
      
   }    
}
