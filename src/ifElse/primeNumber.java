package ifElse;

public class primeNumber {
    public static void main(String[] args) {
      int primeNumberCounter = 0;
      for (int i = 2; i<=1000; i ++){
          if(isPrime(i)){
              System.out.println(i+ " is a prime number.");
              primeNumberCounter++;
          }
      }
        System.out.println("There are "+primeNumberCounter+" in between.");

    }
    public static boolean isPrime(int num){
        boolean isPrime = true;
        if(num<=1){
            isPrime = false;
        }
        else{
            for(int i = num-1;i >= 2; i--){
                if(num%i == 0){
                    isPrime = false;
                }

            }
        }
        return isPrime;
    }
}
