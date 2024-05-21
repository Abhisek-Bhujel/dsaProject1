package ifElse;

public class calculateInterest {
    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10; rate+=0.25){

            System.out.println("Interest amount with "+rate+" interest rate is "+interest(10000,rate));
        }
    }
    public static double interest(double amount, double rate){
        return (amount *(rate/100));
    }
}
