package BillBurgerPlace;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("drink", "coke", 1.0);
        item1.printItem();

        item1.setSize("SMALL");
        item1.printItem();

        Item avocado = new Item("toppings", "avocado", 1.0);
        avocado.printItem();

        Burger burger = new Burger("regular", 4.00);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();

        System.out.println("-".repeat(30));

        MealOrder meal = new MealOrder();
        meal.printItemizedList();

        System.out.println("-".repeat(30));

        MealOrder meal2 = new MealOrder("Regular","Sprite","fries");
        meal2.addBurgerToppings("AVOCADO","BACON","CHEESE");
        meal2.setDrinkSize("LARGE");
        meal2.printItemizedList();
    }
}
