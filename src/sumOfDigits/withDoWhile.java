package sumOfDigits;

public class withDoWhile {
    public static int sumDigits(int number){
        int sum = 0;
        if (number<0){
            return -1;
        }
        else{
           do
           {
               sum = sum + number % 10;
               number = number/10;

            }while(number >0);
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(5689));
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(1));
    }
}
