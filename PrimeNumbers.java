import java.io.*;
import java.util.*;

public class PrimeNumbers{

    private static int numbersPerLine = 10;
    
        public static void main(String args[]) throws IOException{
            System.out.println("Enter amount of prime numbers to generate:");
            Scanner input = new Scanner(System.in);

            int amount = input.nextInt();
    
            generatePrimeNumbers(amount, "primeNumbers.txt");
    
            int[] primeNumbers = readNumbersIntoArray(amount, "primeNumbers.txt");

            for (int i = 1; i < amount; i++) {
                System.out.printf("%10s", primeNumbers[i]);
                if(i % 10 == 0){
                    System.out.println("");
                }
            }

            System.out.println("\n");
   
        }
    
        public static void generatePrimeNumbers(int amount, String destFile) throws IOException{
            try {
                new File(destFile).delete(); // Clear file (there is a better way to do this but I'm lazy)
            } catch (Exception e) {
            }
    
            BufferedWriter writer = new BufferedWriter(new FileWriter(destFile, true));
            writer.append(amount + "\n");
            ArrayList<Integer> primeNumbers = new ArrayList<>();

            int numbersAdded = 0;
            int num = 1;
    
            while(numbersAdded < amount){
                if(isPrime(num)){
                    primeNumbers.add(num);
                    numbersAdded ++;
                }
                num ++;
            }
    
            int count = 0;
            for(int i = 0; i < primeNumbers.size(); i++){
                String number = (primeNumbers.get(i) + "");
                if(i < primeNumbers.size() - 1){
                    number = number + " ";
                }
                writer.append(number); 
                count ++;
                if(count == numbersPerLine){
                writer.append("\n");
                count = 0;
            }
            
        }

        writer.close();
    }

    public static int[] readNumbersIntoArray(int amount, String destFile) throws IOException {
        Scanner reader = new Scanner(new FileReader(destFile));

        int[] primeNumbers = new int[amount + 1];
        primeNumbers[0] = 100;

        for (int i = 0; i < amount; i++) {
            primeNumbers[i] = Integer.parseInt(reader.next());
            //System.out.println(Integer.parseInt(reader.next()));
        }
        
        return primeNumbers;
    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

}
