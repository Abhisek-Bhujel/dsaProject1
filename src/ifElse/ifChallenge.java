package ifElse;

public class ifChallenge {
    public static void main(String[] args) {
        int score = 10000;
        int level = 8;
        int bonus = 200;
        boolean gameOver = true;
        int  finalAmount = 0;
        
        
        if ( gameOver  ){
             finalAmount = (level * bonus) + score;
        }
        System.out.println(finalAmount);
    }
}
