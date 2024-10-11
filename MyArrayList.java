public class MyArrayList<anyType> implements ListInterface<anyType>
{
      private Object[] list;		//stores the actual elements
      private int numElements;	//used to keep track of the number of valid elements in the list
   	
      public MyArrayList()
      {
         list = new Object[0];
         numElements = 0;
      }

      public boolean add(anyType x){
         Object[] temp = new Object[list.length + 1];
         for (int i = 0; i < list.length; i++) {
             temp[i] = list[i];
         }
         temp[list.length] = x;

         this.list = temp;
         return true;
      }
 
      public boolean add(int index, anyType x){
         Object[] temp = new Object[list.length + 1];
         for (int i = 0; i < index; i++) {
             temp[i] = this.list[i];
         }
         temp[index] = x;
         for (int i = index + 1; i < temp.length; i++) {
            temp[i] = this.list[i - 1];
         }

         this.list = temp;
         return true;
      }
    																				
      public int size(){
         return this.list.length;
      }
   
      public anyType set(int index, anyType x){
         anyType t = (anyType) list[index];
         list[index] = x;
         return t;
      }
   
      public anyType get(int index){
         return (anyType) this.list[index];
      }
   
      public anyType remove(int index){
         anyType t = (anyType) list[index];

         Object[] temp = new Object[list.length];
         
         for (int i = index; i < list.length - 1; i++) {
            temp[i] = this.list[i + 1];
         }

         for (int i = index; i < list.length; i++) {
            list[i] = temp[i];
         }
         cutCapacity();

         return t;
      }		
   
      private void doubleCapacity()	//private because this is a helper method that need not be used outside of the class
      {
      	//make list twice as big, i.e. given [A, B, C, null], results with [A, B, C, null, null, null, null, null]
      	//to be used if we add an element that would be over the capacity of list
      }
      
      private void cutCapacity()	//private because this is a helper method that need not be used outside of the class
      {
         int nullElements = 0;
         
      	for (int i = 0; i < list.length; i++) {
            if(list[i] == null){
               nullElements ++;
            }
         }

         if(nullElements > 0){
            Object[] temp = new Object[list.length - nullElements];
            for (int i = 0; i < list.length; i++) {
               if(list[i] != null){
                  temp[i] = list[i];
               }
            }
            this.list = temp;
         }
      }
      
      public String toString()
      {
         String ans = "[";
         for (int i = 0; i < list.length; i++) {
            ans += list[i];
            if(i != list.length - 1)
               ans += ", ";
         }
         return ans + "]";
      }
      
   }
