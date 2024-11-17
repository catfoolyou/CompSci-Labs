public class LinkedList<anyType> implements ListInterface<anyType>
{
   private ListNode<anyType> head;

   public LinkedList()
   {
      head = null;
   }


   public boolean isEmpty()
   {
      return (head == null);
   }   

/**
 * Adds a new element to the front of the LinkedList.
 *
 * @param  x a non-null Object.
 */
   public void addFirst(anyType x)				
   {
      if(head == null){
         head = new ListNode(x, null);
      }
      else{
         ListNode second = head;
         head = new ListNode(x, second);
      }
   }

/**
 * Adds a new element to the end of the LinkedList.
 *
 * @param  x a non-null Object.
 */
   public void addLast(anyType x)
   {
      if (head == null)	
         head = new ListNode(x,null);
      else
      {
         ListNode current = head;
         while(current.getNext()!= null)	
            current = current.getNext();
         current.setNext(new ListNode(x, null));
      }
   }

/**
 * Retrieve the first node in the LinkedList if the head is not null
 *
 * @return the value of the first node in the List, or null if the head is null
 */
   public anyType getFirst()
   {
      if (head == null)	
         return null;	
      return head.getValue();
   }

/**
 * Retrieve the last node in the LinkedList if the head is not null
 *
 * @return the value of the last node in the List, or null if the head is null
 */
   public anyType getLast()
   {
      if(head != null){
         ListNode current = head;
         while(current.getNext() != null){
            current = current.getNext();
         }
         return (anyType) current.getValue();
      }
      return null;
   }   

/**
 * Remove the first node in the LinkedList and return its value if the head is not null
 *
 * @return the value of the node removed from the List, or null if the LinkedList is empty
 */
   public anyType removeFirst() 
   {
      if(head != null){
         anyType first = head.getValue();
         ListNode second = head.getNext();
         head = second;
         second = null;
         return first;
      }
      
      return null;
   }

/**
 * Remove the last element of the list and return its value if the list is not empty
 *
 * @return the value of the element removed, or null if the list is empty
 */
   public anyType removeLast()
   {
      if (head == null)
         return null;
      anyType temp = getLast();
      if (head.getNext() == null)	
         head = null;
      else
      {
         ListNode current = head;		
         while(current.getNext().getNext() != null)	
            current=current.getNext();
         current.setNext(null);			
      }	
      return temp;
   }

/**
 * Returns the number of logical elements stored in the LinkedList.
 *
 * @return the size of the LinkedList.
 */
   public int size()
   {
      if(head != null){
         ListNode current = head;
         int size = 1;
         while(current.getNext() != null){
            current = current.getNext();
            size ++;
         }
         return size;
      }
      return 0;
   }

/**
 * Finds the Object that resides at a given index
 *
 * @param index a value such that index is greater or equal to 0 and index is less than size()
 * @return the value stored in the node at the given index, or null if the list is empty or invalid index
 */
   public anyType get(int index)		
   {
      if(head != null){
         ListNode current = head;
         for(int i = 0; i < index; i++){
            current = current.getNext();
         }
         return (anyType) current.getValue();
      }
      return null;						//temporary code to keep the file compiling
   }	

/**
 * Change the Object that resides at a given index to a new value
 *
 * @param index a value such that index is greater or equal to 0 and index is less than size()
 * @param x a non-null Object
 * @return the old value stored in the node at the given index, or null if the list is empty or invalid index
 */
   public anyType set(int index, anyType x)
   {
      if(head != null){
         ListNode current = head;
         for(int i = 0; i < index; i++){
            current = current.getNext();
         }
         anyType value = (anyType) current.getValue();
         current.setValue(x);
         return value;
      }
      return null;
   }	

//post: adds element x to the end of the list, returns true if successful
   public boolean add(anyType x)
   {
      addLast(x);
      return true;			
   }	

/**
 * Add a new element at a given index
 *
 * @param index a value such that index is greater or equal to 0 and index is less than size()
 * @param x a non-null Object
 * @return if the element was added successfully, false if the index is invalid
 */
   public boolean add(int index, anyType x)
   {
      if(head != null){
         ListNode current = head;
         
         for(int i = 0; i < index - 1; i++){
            current = current.getNext();
         }
         ListNode next = current.getNext();
         current.setNext(new ListNode(x, next));
         return true;
      }
      return false;			
   }	

/**
 * Remove a node that resides at a given index and return its value
 *
 * @param index a value such that index is greater or equal to 0 and index is less than size()
 * @return the value of the element removed, or null if the list is empty or invalid index
 */
   public anyType remove(int index)		
   {
      if(head != null){
         ListNode current = head;
         
         for(int i = 0; i < index - 1; i++){
            current = current.getNext();
         }
         ListNode next = current.getNext();
         anyType value = (anyType) next.getValue();
         current.setNext(next.getNext());
         next = null;
         return value;
      }
      return null;
   }	

/**
 * Returns a String of all the elements in the List in the form [a0, a1, a2, . . . , an-1]
 *
 * @return String of all the list elements separated by a comma
 */
   public String toString()
   {
      String ans = "[";						
      ListNode current =  head;
      while(current != null)
      {
         ans += current.getValue().toString();
         current = current.getNext();
         if (current != null)		
            ans += ",";
      }
      ans += "]";		
      return ans;
   }
}