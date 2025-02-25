import java.util.ArrayList;

public class StackImpl<anyType> implements Stackable<anyType>{
    private ArrayList data = new ArrayList<anyType>();

    public void push(Object x){
        this.data.add(0, x);
    }	

    public anyType pop(){
        Object temp = this.data.get(0);
        this.data.remove(0);
        return (anyType) temp;
    }		 
                                    
    public anyType peek(){
        return (anyType) this.data.get(0);
    }		

    public boolean isEmpty(){
        return this.data.isEmpty();
    }
   
    public int size(){
        if(!this.data.isEmpty()){
            return this.data.size();
        }
        else{
            return 0;
        }
    }

}