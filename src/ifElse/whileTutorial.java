package ifElse;

public class whileTutorial {
    public static void main(String[] args) {
        int i = 5;
        int evenCount = 0;
        while(i<=20){
            if(isEvenNumber(i)){
                System.out.println(i+" is even.");
                evenCount++;
            }
            if(evenCount == 5){
                break;
            }
            i++;
        }

    }

    public static boolean isEvenNumber(int a){

        if(a%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
