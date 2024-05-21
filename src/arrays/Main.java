package arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = getRandomArray(10);
        System.out.println(Arrays.toString(arr1));
         Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0 ; i < len; i++){
            newInt[i]= random.nextInt(100);
        }
        return newInt;
    }
}
