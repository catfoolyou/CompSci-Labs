   public class dListNode<anyType>
   {
      private anyType value;		//the data contained in the node
      private dListNode next;		//a reference to the next object in the list
      private dListNode prev;		//a reference to the previous object in the list
   
      public dListNode(anyType initValue, dListNode initPrev, dListNode initNext)		//constructor
      {
         value = initValue;
         prev = initPrev;
         next = initNext;
      }
   
      public dListNode(anyType initValue)		//constructor
      {
         this(initValue, null, null);			//"this(initValue, null)" calls the objects other constructor
      }
   
   //pre:  the ListNode object for which this is called is not null
   //post: returns the data stored in the ListNode  O(1)
      public anyType getValue()				
      {
         return value;
      }
   
   //pre:  the ListNode object for which this is called is not null
   //post: returns the reference to the next ListNode object in the Linked List  O(1)
   
      public dListNode getNext()
      {
         return next;
      }
   
   //pre:  the ListNode object for which this is called is not null
   //post: returns the reference to the previous ListNode object in the Linked List  O(1)
   
      public dListNode getPrev()
      
      {
         return prev;
      }
   
   
   
   //pre:  the ListNode object for which this is called is not null
   //post: changes the objects data to newValue  O(1)
      public void setValue(anyType newValue)
      {
         value = newValue;
      }
   
   //pre:  the ListNode object for which this is called is not null
   //post: changes the ListNode's prev reference to newNext  O(1)
   
      public void setPrev(dListNode newPrev)
      
      {
         prev = newPrev;
      }
   
   
   //pre:  the ListNode object for which this is called is not null
   //post: changes the ListNode's next reference to newNext  O(1)
      public void setNext(dListNode newNext)
      {
         next = newNext;
      }
   
   }
