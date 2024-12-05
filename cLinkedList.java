public class cLinkedList<anyType> implements ListInterface<anyType>
{
   private ListNode<anyType> head;			//refers to the first element

   public cLinkedList()						//constructor
   {
      head = null;
   }

//WRITE THIS METHOD***********************************************
//post: adds x to the front of the list
   public void addFirst(anyType x)				
   {
      if(head == null) {
         head = new ListNode(x);
         head.setNext(head);
      }
      else
      {
         ListNode oldLast = getLastNode();
         ListNode oldHead = head;
         head = new ListNode(x, oldHead);
         oldLast.setNext(head);
      }
   }
//****************************************************************

//WRITE THIS METHOD***********************************************
//post:  adds x to the end of the list
   public void addLast(anyType x)
   {
      if (head == null) {
         head = new ListNode(x);
         head.setNext(head);
      }
      else
      {
         ListNode lastNode = getLastNode();
         lastNode.setNext(new ListNode(x, head));
      }
   }
//****************************************************************

//pre:  the head is not null
//post: returns the head's value
   public anyType getFirst()
   {
      if (head == null)							//if list is empty
         return null;
      return head.getValue();
   }

//pre:  the lastNode is not null
//post: returns the lastNode's value
   public anyType getLast()
   {
      return (head == null) ? null : (anyType) this.getLastNode().getValue();
   }

   private ListNode getLastNode()
   {
      if (head == null)
         return null;

      ListNode<anyType> current = head;
      while(current.getNext()!= head) {
         current = current.getNext();
      }
      return current;
   }

   private ListNode getNextToLastNode()
   {
      if (head == null)
         return null;

      ListNode<anyType> current = head;
      while(current.getNext().getNext() != head){
         current = current.getNext();
      }

      return current;
   }

//WRITE THIS METHOD***********************************************
//pre:  the head is not null
//post: removes the first element from the list and returns its value
   public anyType removeFirst() 
   {
      if (head == null) {
         return null;
      }

      ListNode last = getLastNode();
      anyType firstValue = head.getValue();

      if (head == last){
         head = null;
      }
      else {
         head = head.getNext();
         last.setNext(head);
      }

      return firstValue;
   }
//****************************************************************

//WRITE THIS METHOD***********************************************
//pre:  the head is not null
//post: removes the last element from the list and returns its value
   public anyType removeLast()
   {
      if (head == null) {
         return null;
      }

      ListNode newLast = getNextToLastNode();
      anyType lastValue = (anyType) newLast.getNext().getValue();
      if(newLast == head){
         head = null;
      }
      else {
         newLast.setNext(head);
      }

      return lastValue;
   }
//****************************************************************

 //WRITE THIS METHOD***********************************************
//post: returns the number of elements
   public int size()
   {
      if(head != null){
         ListNode current = head;
         int size = 1;
         while(current.getNext() != head && current.getNext() != null){
            current = current.getNext();
            size ++;
            if(current.getNext() == null){
                current.setNext(head); 
                break;           
            }
            if(current.getNext() == head){ 
                break;           
            }
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
         ListNode current = head;
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
         ListNode current = head;
         if (index == 0){
            addFirst(x);
            return true;
         }

         for(int i = 1; i < index; i++){
            current = current.getNext();
         }
         current.setNext(new ListNode(x, current.getNext()));
         return true;
      }
      else if(index == 0){
         addFirst(x);
         return true;
      }
      else {
         return false;
      }
   }	
//****************************************************************

//WRITE THIS METHOD***********************************************
//pre: index >=0 and index < size()
//post: removes and returns the object at a specific index (first element is index 0)
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
//****************************************************************	


//pre:  the head is not null
//post: shows all elements of the list O(n)
   public void showList()
   {
      if (head == null)
         System.out.println("List is empty");
      else
      {
         ListNode<anyType> current = head;
         while(current.getNext() != head)
         {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
         }	
         System.out.println(current.getValue());
         System.out.println("And here is the last element's next: " + current.getNext().getValue());
      
      }
   
   }

//pre:
//post:  returns the contents of the list as a String in the form of [a1, a2, a3,...,an] where a1 is the first element and an is the last
   public String toString()
   {
      String ans = "[";
      if (!isEmpty()){
         ans += head.getValue();
         ListNode<anyType> current = head;
         while(current.getNext() != head)
         {
            ans += (", " + current.getNext().getValue());
            current = current.getNext();
         }
      }
      ans += "]";		
      return ans;
   }

   public boolean isEmpty()
   {
      if (head == null)
         return true;
      return false;
   }

}
