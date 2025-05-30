public class Main {
    public static void main(String[] args) {
        while(true){
            try{
                System.out.println("******** Rock Paper Scissors ********");
                Machine machine = new Machine();
                machine.decideMenu();
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