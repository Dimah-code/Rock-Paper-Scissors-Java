public class Main {

    public static void main(String[] args) {
        Machine machine = new Machine();
        System.out.println("******** Rock Paper Scissors ********");
        machine.menuBar();
        for (int i = 0; i < machine.getGameMode(); i++){
            try{
                machine.getDecide();
                machine.Play();
                try{
                    Thread.sleep(2500);
                }
                catch(Exception e){
                    System.out.println("Error: Play another game=)");
                    continue;
                }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
                continue;
            }
        }
    }
}