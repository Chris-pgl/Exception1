import java.nio.file.StandardWatchEventKinds;

public class Main {

    public static void gino(double score) throws ArithmeticException {
        if (score > 0 && score <= 50.00) {
            System.out.println("Average score");
        } else if (score > 50.00 && score <= 100.00) {
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException("Score is out of scale!");
        }
    }


    public static void main(String[] args)  {


        try {
            gino(150.2);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


        try {
            CheckScore.checkScore(2.15);
            CheckScore.checkScore(50);
            CheckScore.checkScore(95.02);
            CheckScore.checkScore(100.01);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


    }
}
