package Encapsulation;

public class MainPrinter {
    public static void main(String[] args) {
       Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        System.out.println(printer.addToner(0));
    }
}
