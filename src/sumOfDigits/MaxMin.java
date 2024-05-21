package sumOfDigits;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maxNum = 0;
        double minNum = 0;
        int loopCount = 0;

        while( true ){
            System.out.println("Enter number or any character to quit");
            String dataEntered = sc.nextLine();
            try{
                double validData = Double.parseDouble(dataEntered);
                if(loopCount == 0 ||validData < minNum){
                    minNum = validData;
                }
                if(loopCount == 0 || validData > maxNum){
                    maxNum = validData;
                }
            }
            catch(NumberFormatException e){
                break;
            }
            loopCount++;
        }
        if(loopCount > 0) {
            System.out.println("Maximum number is : " + maxNum + " and Minimum number is " + minNum);
        }else{
            System.out.println("Valid data was not entered");
        }
    }
}
