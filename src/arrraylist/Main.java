package arrraylist;

import java.util.ArrayList;

record GroceryItems (String name, String type, int count){
    public GroceryItems (String name){
        this(name, "DAIRY",1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(),type);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<GroceryItems> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItems("Butter"));
        groceryItems.add(new GroceryItems("Oranges","Produce",8));
        groceryItems.add(0,new GroceryItems("Apples","Produce",6));
        groceryItems.set(2,new GroceryItems("Mangoes","Produce",9));
        System.out.println(groceryItems);


    }
}
