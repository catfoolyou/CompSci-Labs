import java.io.*;
import java.util.*;

public class PrimeNumbers{

    private static final int numbersPerLine = 10;
    private static final int numbersPerRow = 5;
    
    public static void main(String args[]) throws IOException{
        System.out.println("Enter amount of prime numbers to generate:");
        Scanner input = new Scanner(System.in);

        int amount = input.nextInt();

        generatePrimeNumbers(amount, "primeNumbers.txt");

        ArrayList<Integer> primeNumbers = readNumbersIntoArray(amount, "primeNumbers.txt");

        System.out.printf("\nThe first %s prime numbers (2 - %s)\n", amount, primeNumbers.get(primeNumbers.size() - 1));

        for (int i = 0; i < amount; i++) {
            System.out.printf("%10s", primeNumbers.get(i));
            if((i + 1) % numbersPerRow == 0){
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
            writer.append(number);
            count ++;
            if(count < numbersPerLine){
                writer.append(",");
            }
            if(count == numbersPerLine && i < primeNumbers.size() - 1){
                writer.append("\n");
                count = 0;
            }
        }

        writer.close();
    }

    public static ArrayList<Integer> readNumbersIntoArray(int amount, String srcFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(srcFile));
        reader.readLine();

        String row;
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        String[] line;

        ArrayList<Integer> numbersInLine = new ArrayList<>();

        while((row = reader.readLine()) != null){
            line = row.split(",");
            numbersInLine.clear();
            for(String s : line){
                numbersInLine.add(Integer.parseInt(s));
            }
            primeNumbers.addAll(numbersInLine);
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
