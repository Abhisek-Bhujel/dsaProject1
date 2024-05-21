package Encapsulation;

public class Main {
    public static void main(String[] args) {
       Player player1 = new Player();
        player1.name = "Azize";
        player1.health = 30;
        player1.weapon = "Sword";

        player1.loseHealth(15);
        System.out.println("Remaining health: "+ player1.health);

        EnhancedPlayer enhancedPlayer1 =  new EnhancedPlayer("Tim");
        EnhancedPlayer enhancedPlayer2 =  new EnhancedPlayer("Sam", 467, "Gun");

        System.out.println(enhancedPlayer1.healthRemaining());
        System.out.println(enhancedPlayer2.healthRemaining());


    }
}
