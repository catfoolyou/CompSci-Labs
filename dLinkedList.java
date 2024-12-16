public class dLinkedList<anyType> implements ListInterface<anyType>
{
   private dListNode<anyType> head;			//refers to the first element

   public dLinkedList()						//constructor
   {
      head = null;
   }

  //WRITE THIS METHOD***********************************************
  //post: adds x to the front of the list O(1)
   public void addFirst(anyType x)				
   {
        if(this.head == null){
            this.head = new dListNode(x, null, null);
        }
        else{
            this.head = new dListNode(x, null, head);        
        }
   }
  //****************************************************************

  //WRITE THIS METHOD***********************************************
  //post:  adds x to the end of the list O(n)
   public void addLast(anyType x)
   {
      if(this.head == null){
            this.head = new dListNode(x, null, null);
        }
        else{
            dListNode last = this.getLastNode();
            last.setNext(new dListNode(x, last, null));    
        }
   }
  //****************************************************************

//pre:  the head is not null
//post: returns the head's value O(1)
   public anyType getFirst()
   {
      if (head == null)							//if list is empty
         return null;
      return head.getValue();
   }

//pre:  the lastNode is not null
//post: returns the lastNode's value O(n)
   public anyType getLast()
   {
      if (head == null)							//if list is empty
         return null;
   
      dListNode<anyType> current = head;
      while(current.getNext()!= null)		//make current go to the last element
         current = current.getNext();
      return current.getValue();
   }

   public dListNode getLastNode()
   {
      if (head == null)							//if list is empty
         return null;
   
      dListNode<anyType> current = head;
      while(current.getNext()!= null)		//make current go to the last element
         current = current.getNext();
      return current;
   }

//WRITE THIS METHOD***********************************************
//pre:  the head is not null
//post: removes the first element from the list O(1) and returns its value
   public anyType removeFirst()
   {
   
        if (head == null){
            return null;        
        }
            
        if (head.getNext() == null){
            anyType headValue = head.getValue(); 
            this.head = null;
            return headValue;
        }

        anyType headValue = head.getValue();   

        this.head = head.getNext();
        this.head.setPrev(null);

        return headValue;
   }
//****************************************************************

//WRITE THIS METHOD***********************************************
//pre:  the head is not null
//post: removes the last element from the list O(n) and returns its value
   public anyType removeLast()
   {
   
      if (head == null){
            return null;        
      }
            
      if (head.getNext() == null){
            anyType headValue = head.getValue(); 
            this.head = null;
            return headValue;
      }
   
      anyType lastVal = this.getLast();
      this.getLastNode().getPrev().setNext(null);

      return lastVal;

   }
//****************************************************************

//WRITE THIS METHOD***********************************************
//post: returns the number of elements
   public int size()
   {
    	if(head != null){
         dListNode current = head;
         int size = 1;
         while(current.getNext() != null){
            current = current.getNext();
            size ++;
         }
         return size;
      }
      return 0;
   }
//****************************************************************

//WRITE THIS METHOD***********************************************
//pre: index >=0 and index < size()
//post: returns the object at a specific index (first element is index 0)
   public anyType get(int index)		
   {
      if(head != null){
         dListNode current = head;
         for(int i = 0; i < index; i++){
            current = current.getNext();
         }
         return (anyType) current.getValue();
      }
      return null;		
   }	
//****************************************************************	

//WRITE THIS METHOD***********************************************
//pre:  index >=0 and index < size()
//post: changes the element at a specific index to x, returning the element that was originally there
   public anyType set(int index, anyType x)
   {
      if(head != null){
         dListNode current = head;
         for(int i = 0; i < index; i++){
            current = current.getNext();
         }
         anyType value = (anyType) current.getValue();
         current.setValue(x);
         return value;
      }
      return null;						//temporary code to keep the file compiling
   }	
//****************************************************************

//post: adds element x to the end of the list, returns true if successful
   public boolean add(anyType x)
   {
      addLast(x);
      return true;			
   }	

//WRITE THIS METHOD***********************************************
//pre:  index >=0 and index < size()
//post: adds element x at index i, returns true if successful
   public boolean add(int index, anyType x)
   {
      if(head != null){
         dListNode current = head;
         
         for(int i = 0; i < index - 1; i++){
            current = current.getNext();
         }
         dListNode next = current.getNext();
         current.setNext(new dListNode(x, current, next));
         return true;
      }
      return false;			
   }	
//****************************************************************

//WRITE THIS METHOD***********************************************
//pre: index >=0 and index < size()
//post: removes and returns the object at a specific index (first element is index 0)
   public anyType remove(int index)		
   {
      if(head != null){
         dListNode current = head;
         
         for(int i = 0; i < index - 1; i++){
            current = current.getNext();
         }
         dListNode next = current.getNext();
         anyType value = (anyType) next.getValue();
         current.setNext(next.getNext());
         next = null;
         return value;
      }
      return null;	
   }	
//****************************************************************	


//pre:  the head is not null
//post: shows all elements of the list O(n)
   public void showList()
   {
      if (head==null)						//if list is empty
         System.out.println("List is empty");
      else
      {
         dListNode<anyType> current =  head;
         while(current != null)
         {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
         }	
         System.out.println();
      }
   
   }

  //post: returns all elements of the list as a String 
//in the form [a0, a1, a2, . . . , an-1],  O(n)
   public String toString()
   {
      String ans = "[";									//start with left bookend						
      dListNode<anyType> current =  head;
      while(current != null)
      {
         ans += current.getValue().toString();
         current = current.getNext();
         if (current != null)							//don't add comma after the last element
            ans += ",";
      }
      ans += "]";											//end with right bookend
      return ans;
   }


   public boolean isEmpty()
   {
      if (head == null)
         return true;
      return false;
   }

}
