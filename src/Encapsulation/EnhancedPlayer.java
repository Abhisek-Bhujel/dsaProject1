package Encapsulation;

public class EnhancedPlayer {
    private String FullName;
    private int healthPercantage;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100, "Sword");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.FullName = name;
        if(health <= 0){
            this.healthPercantage = 1;
        }

        else if  (health>100){
            this.healthPercantage = 100;
        }
        else{
            this.healthPercantage = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        healthPercantage = healthPercantage -damage;
        if(healthPercantage <=0){
            System.out.println("Player has been knocked out");
        }
    }

    public int healthRemaining()
    {
        return healthPercantage;
    }
    public void restoreHealth(int token){
        healthPercantage =  healthPercantage + token;
        if(healthPercantage > 100){
            System.out.println("Player health restored to 100%");
        }

        healthPercantage = 100;
    }

}
