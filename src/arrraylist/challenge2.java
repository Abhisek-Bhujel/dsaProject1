package arrraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class challenge2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      boolean flag = true;

      ArrayList<String> groceryList = new ArrayList<>();
      while (flag){
          printMessage();
          switch(Integer.parseInt(sc.nextLine())){
              case 1 -> addItems(groceryList);
              case 2 -> removeItems(groceryList);
              default -> flag = false;
          }
          groceryList.sort(Comparator.naturalOrder());
          System.out.println(groceryList);
      }


    }

    public static void addItems(ArrayList<String>grocery){
        System.out.println("Add groceries separated by commas");
        String[] item =  sc.nextLine().split(",");
        for (String i: item) {
            String trimmedItem = i.trim();
            if(grocery.indexOf(trimmedItem)<0) {
                grocery.add(trimmedItem);
            }
        }
    }
    public static void removeItems(ArrayList<String>groceryList){
        System.out.println("remove groceries separated by commas");
        String[] item =  sc.nextLine().split(",");
        for (String i: item) {
            String trimmedItem = i.trim();
            groceryList.remove(trimmedItem);
        }
    }

    public static void printMessage(){
        String welcomeMessage = """
                Available actions
                0 - to Shutdown
                1 - to add items
                2 - to remove items
                Enter the number for which action you want to do :
                """;
        System.out.println(welcomeMessage + " ");
    }
}
