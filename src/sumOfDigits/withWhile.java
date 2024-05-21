package sumOfDigits;

public class withWhile {
    public  int sumDigits(int number){
        int sum = 0;
        if (number<0){
            return -1;
        }
        else{
           while (number > 0){

               sum = sum + number%10;
               number= number/10;
           }
           return sum;
        }
    }

    public static void main(String[] args) {
        withWhile w = new withWhile();
        System.out.println(w.sumDigits(5089));
        System.out.println(w.sumDigits(-1));
        System.out.println(w.sumDigits(0));
        System.out.println(w.sumDigits(1));
    }
}
