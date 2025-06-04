import java.util.Random;
import java.util.Scanner;

public class Machine {
    private int decideNumber, random, gameMode;
    Scanner scanner = new Scanner(System.in);
    public void menuBar(){
        Menu menu = new Menu();
        menu.gameMode();
        setGameMode();
        menu.menu();
    }
    private void setGameMode(){
        System.out.println("Make your decide");
        gameMode = scanner.nextInt();
    }
    public int getGameMode(){
        return gameMode;
    }
    public void getDecide(){
        System.out.println("Make your decide");
        decideNumber = scanner.nextInt();
    }
    public void Play(){
        randomMaker();
        System.out.println("You picked " + dictionary(decideNumber));
        System.out.println("Machine picked " + dictionary(random));
        if(decideNumber == random){
            System.out.println("Mosavi");
        } else if (decideNumber == 1 && random == 3 ||
                decideNumber == 2 && random == 1 ||
                decideNumber == 3 && random == 2) {
            System.out.println("You won!");
        }
        else{
            System.out.println("Machine won");
        }
    }
    // Win Theories: rock => scissors
    //               scissors => paper
    //               paper => rock
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
    public int getRandom(){
        return random;
    }
}
