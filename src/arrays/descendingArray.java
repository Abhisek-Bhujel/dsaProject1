package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class descendingArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Give int of array in position " +(i+1) + ": ");
            Scanner sc =  new Scanner(System.in);
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int temp;
        boolean flag = true;
        while(flag){
            flag=false;
            for(int i = 0; i < arr.length -1; i++){
                if(arr[i]< arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
