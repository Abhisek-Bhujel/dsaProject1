package arrraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {
        int action;
        Scanner sc = new Scanner(System.in);
        String welcomeMessage = """
                Available actions
                0 - to Shutdown
                1 - to add items
                2 - to remove items
                Enter the number for which action you want to do :
                """;
        System.out.println(welcomeMessage);
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Apple");
        System.out.println("Current items in a list: " + groceryList);
        do{
            action = sc.nextInt();
            if(action  == 1){
                System.out.println("What  item do you want to add?");
                String addItem = sc.next();
                groceryList.add(addItem);
            } else if (action == 2) {
                System.out.println("Which item do you want to remove? ");
                String removeItem = sc.next();
                groceryList.remove(removeItem);
            }
            System.out.println(groceryList);
        }while(action !=  0);


    }
}
