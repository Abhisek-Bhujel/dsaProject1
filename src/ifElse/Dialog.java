package ifElse;

public class Dialog {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(1700);
        displayHighScorePosition("Abhisek",position);

        }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get in a "+position+" on the high score list.");
    }
   public static int calculateHighScorePosition(int score){
        int position = 0;
       if (score >= 1000){
           position = 1;
       }

       else if (score >= 500 && score < 1000){
           position = 2;
       }

       else if(score >= 100 && score < 500){
           position = 3;
       }
       else{
           position = 4;
       }
       return position;
   }


}
