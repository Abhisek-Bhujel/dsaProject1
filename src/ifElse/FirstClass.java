package ifElse;

public class FirstClass {
    public static void main(String[] args) {
        double a = 20;
        double b = 80;
        double c = (a+b)*100;
        System.out.println("c = "+c);
        double d = c%40;
        System.out.println("d = "+d);
        boolean hasRemainder = d==0 ? true : false;
        System.out.println(hasRemainder);
        String s = hasRemainder == true ? "got some remainder" : "No remainder ";
        System.out.println(s);

    }
}
