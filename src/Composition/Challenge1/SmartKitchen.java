package Composition.Challenge1;

public class SmartKitchen {
    private DishWasher dishWasher ;
    private Refrigerator refrigerator;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen() {
        this.dishWasher = new DishWasher();
        this.refrigerator = new Refrigerator();
        this.coffeeMaker = new CoffeeMaker();
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        dishWasher.setHasWorkToBeDone(dishWasherFlag);
        refrigerator.setHasWorkToBeDone(fridgeFlag);
        coffeeMaker.setHasWorkToBeDone(coffeeFlag);
    }

    public void doKitchenWork(){
        dishWasher.doDishes();
        refrigerator.orderFood();
        coffeeMaker.brewCoffee();
    }

}
 class DishWasher{
    private boolean hasWorkToBeDone;

     public void setHasWorkToBeDone(boolean hasWorkToBeDone) {
         this.hasWorkToBeDone = hasWorkToBeDone;
     }

     public void doDishes(){
         if(hasWorkToBeDone){
             System.out.println("Do dishes");
                hasWorkToBeDone=false;
         }
     }

 }

class Refrigerator{
    private boolean hasWorkToBeDone;

    public void setHasWorkToBeDone(boolean hasWorkToBeDone) {
        this.hasWorkToBeDone = hasWorkToBeDone;
    }

    public void orderFood(){
        if(hasWorkToBeDone){
            System.out.println("Order Food");
            hasWorkToBeDone=false;
        }
    }

}

class CoffeeMaker{
    private boolean hasWorkToBeDone;

    public void setHasWorkToBeDone(boolean hasWorkToBeDone) {
        this.hasWorkToBeDone = hasWorkToBeDone;
    }

    public void brewCoffee(){
        if(hasWorkToBeDone){
            System.out.println("Brew Coffee");
            hasWorkToBeDone=false;
        }
    }

}

