import java.util.Random;
import java.util.Scanner;

public class Machine {
    private int decideNumber;
    private int random;
    Scanner scanner = new Scanner(System.in);
    public void decideMenu(){
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("0. Exit");
        getDecide();
    }
    private void getDecide(){
        System.out.println("Make your decide");
        decideNumber = scanner.nextInt();
    }
    public void Play(){
        randomMaker();
        if(decideNumber == random){
            System.out.println("Mosavi");
        } else if (decideNumber < random) {
            System.out.println("Machine Won");
        }
        else{
            System.out.println("You Won");
        }
    }
    private void randomMaker(){
        Random rand = new Random();
        random =  rand.nextInt(1,4);
    }
}
