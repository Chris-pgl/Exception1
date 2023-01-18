public class CheckScore extends Exception{

    public static void checkScore(double score) throws ArithmeticException {
        if (score > 0 && score <= 50) {
            System.out.println("Average score");
        } else if (score > 50 && score <= 100) {
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException("Score is out of scale!");
        }
    }
}
