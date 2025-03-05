import java.util.LinkedList;

public class MyQueue<T> implements Queueable<T> {

    private LinkedList<T> list;

    public MyQueue() {
        list = new LinkedList<T>();
    }

    public void add(T x) {
        this.list.add(x);
    }

    public T remove() {
        return this.list.remove(0);
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public T peek() {
        return this.list.get(0);
    }

    public int size() {
        return this.list.size();
    }

    public String toString() {
        return this.list.toString();
    }

}
