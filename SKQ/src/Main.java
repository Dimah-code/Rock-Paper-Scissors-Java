public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("******** Rock Paper Scissors ********");
            Machine machine = new Machine();
            machine.decideMenu();
            machine.Play();
        }
    }
}