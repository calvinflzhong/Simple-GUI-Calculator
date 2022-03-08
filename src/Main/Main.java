package Main;

//Main to launch calculator
public class Main {
    public static void main(String[] args){
        try {
            MainCalculator mainCalculator = new MainCalculator();
            mainCalculator.run();
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
}
