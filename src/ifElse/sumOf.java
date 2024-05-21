package ifElse;

public class sumOf {
    public static void main(String[] args) {
        int count =0;
        int sum = 0;
        for (int i = 1; i <=1000; i++){
            if(i%3 ==0 && i%5 == 0){
                sum+=i;
                count++;
                System.out.println("Number divisible by both 3 and 5 is "+i);
            }
            if(count==5){
                break;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
