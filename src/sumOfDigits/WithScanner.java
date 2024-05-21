package sumOfDigits;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WithScanner {
    public static void main(String[] args) {
        int questionCount = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (questionCount <= 5){
            System.out.println("Enter your #" + questionCount + " number: ");
            try{
                int number = scanner.nextInt();
                sum = sum + number;
            }
            catch (InputMismatchException e){
                System.out.println("Invalid Number format. Please enter Integer");
                scanner.next();
                continue;
            }
            questionCount++;
        }
        System.out.println(sum);
        scanner.close();
    }
}
