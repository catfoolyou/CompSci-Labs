public interface Stackable<anyType>
{
   public void push(anyType x);	

   public anyType pop();		 
                                    
   public anyType peek();		

   public boolean isEmpty();	
   
   public int size();  
}