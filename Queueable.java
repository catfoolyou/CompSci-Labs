
public interface Queueable<T> {

    boolean isEmpty();

    //precondition: queue is [a1, a2, ..., an]with n >= 0  
    //postcondition: queue is [a1, a2, ..., an, x]	   
    void add(T x);

    //precondition: queue is [a1, a2, ..., an] with n >= 1    
    //postcondition: queue is [a2, ..., an]; returns a1 
    //throws an unchecked exception if the queue is empty
    T remove();

    //precondition: queue is [a1, a2, ..., an]with n >= 1
    //postcondition: returns a1.  
    //Throws an unchecked exception if the queue is empty
    T peek();

}
