import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Time;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TrafficSim {

    private static int lightCycles;
    private static MyQueue mainStreet = new MyQueue<>();
    private static MyQueue mapleStreet = new MyQueue<>();

    private static int mainTime;
    private static int mainProb;

    private static boolean mainGreen = true;

    private static int mapleTime;
    private static int mapleProb;

    private static boolean mapleGreen = false;

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        initTimeProb();   
        setLightCycles(); 
        doSimulation();
    }

    public static void doSimulation() throws InterruptedException{
        for (int i = 0; i < lightCycles; i++) {
            System.out.println("Main Street: " + mainStreet);
            System.out.println("Maple Street: " + mapleStreet);
            System.out.println();

            if(mainGreen == false){
                for (int j = 0; j < mainProb; j++) {
                    if(mainProb > ThreadLocalRandom.current().nextInt(0, 101)){
                        mainStreet.add("*");
                    }
                }
                for (int k = 0; k < mapleStreet.size(); k++) {
                    mapleStreet.remove();
                }

                Thread.sleep(10 * mapleTime);
            }
            
            if(mapleGreen == false){
                for (int j = 0; j < mapleProb; j++) {
                    if(mapleProb > ThreadLocalRandom.current().nextInt(0, 101)){
                        mapleStreet.add("*");
                    }
                }
                for (int k = 0; k < mainStreet.size(); k++) {
                    mainStreet.remove();
                }

                Thread.sleep(10 * mainTime);
            }

            mainGreen = !mainGreen;
            mapleGreen = !mapleGreen;
        }
    }

    public static void initTimeProb() throws FileNotFoundException{
        Scanner fileReader = new Scanner(new File("Traffic.txt"));
        mainTime = fileReader.nextInt();
        mainProb = fileReader.nextInt();
        mapleTime = fileReader.nextInt();
        mapleProb = fileReader.nextInt();
    }

    public static void setLightCycles(){
        System.out.println("Enter amount of light cycles");
        Scanner input = new Scanner(System.in);
        lightCycles = input.nextInt();
    }

}
