package arrays;

import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {
        int[] firstFivePositives = new int[]{1,2,3,4,5}; //The Array Initializer
        System.out.println(firstFivePositives[0]);
        int arrayLength = firstFivePositives.length;
        System.out.println(arrayLength);

        for(int i = 0; i< arrayLength; i++){
            System.out.print(firstFivePositives[i] + " ");
        }

        //foreach
        for (int k:
             firstFivePositives) {
            System.out.println(k);
        }

        System.out.println(Arrays.toString(firstFivePositives));
    }
}
