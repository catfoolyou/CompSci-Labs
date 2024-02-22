import java.util.*;
public class InsertionSort{
   public static void insertionSort(ArrayList<Integer> list){
      System.out.println("Unsorted: \n" + list + "\n");
      
      int s = list.size();
      for (int i = 1; i < s; ++i) {
         int key = list.get(i);
         int j = i - 1;
      
         while (j >= 0 && list.get(j) > key) {
            list.set(j + 1, list.get(j));
            j = j - 1;
         }
         list.set(j + 1, key);
      }
      System.out.println("Sorted: \n" +list);
   }

   public static void main(String Args[]){
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      Random random = new Random();
      
      for(int i = 0; i < 20; i++){
         numbers.add(random.nextInt(50 - 15) + 15);
      }
      
      insertionSort(numbers);
   }

}