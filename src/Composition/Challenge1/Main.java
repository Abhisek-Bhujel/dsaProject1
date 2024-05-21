package Composition.Challenge1;

public class Main {
    public static void main(String[] args) {
     SmartKitchen smartKitchen = new SmartKitchen();
     smartKitchen.getDishWasher().setHasWorkToBeDone(true);
     smartKitchen.getRefrigerator().setHasWorkToBeDone(true);
     smartKitchen.getCoffeeMaker().setHasWorkToBeDone(true);
     smartKitchen.getDishWasher().doDishes();
     smartKitchen.getDishWasher().doDishes();
     smartKitchen.getCoffeeMaker().brewCoffee();
     smartKitchen.getRefrigerator().orderFood();
        System.out.println("------------------------------------");
        System.out.println("______________________________________");
     smartKitchen.setKitchenState(true,true,false);
     smartKitchen.doKitchenWork();




    }
}
