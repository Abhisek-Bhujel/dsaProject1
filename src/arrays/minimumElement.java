package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class minimumElement {
    public static void main(String[] args) {
        int[] arr = readIntegers();
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum value is: "+ minValue(arr));
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
    private static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by comma'");
        String input =  sc.nextLine();
        String[] splits = input.split(",");
        int[] arr = new int[splits.length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(splits[i].trim());
        }

        return arr;
    }

    private static int minValue(int[] arr){
        int minValue =  arr[0] ;
        for(int i = 0; i < arr.length;  i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    private static int[] reverseArray(int[] arr){
        int[] newArray = new int[arr.length];
        for (int i = arr.length-1, j = 0;i >=0; i--, j++){
            newArray[j] = arr[i];
        }
        return newArray;
    }
}
