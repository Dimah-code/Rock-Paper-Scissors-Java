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
        System.out.println("You picked " + dictionary(decideNumber));
        System.out.println("Machine picked " + dictionary(random));
        if(decideNumber == random){
            System.out.println("Mosavi");
        } else if (decideNumber < random) {
            System.out.println("Machine Won");
        }
        else if(decideNumber > random){
            System.out.println("You Won");
        }
    }
    private void randomMaker(){
        Random rand = new Random();
        random =  rand.nextInt(1,4);
    }
    private String dictionary(int number){
        String dict = switch (number) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Invalid";
        };
        return dict;
    }
}
