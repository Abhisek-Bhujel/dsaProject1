package inheritance.Challenge1;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985",
                "01/01/2022");

        System.out.println(tim);
        System.out.println("Age : " + tim.getAge());
        System.out.println("Pay : " + tim.collectPay());

        SalariedEmployee jaime = new SalariedEmployee("Jaime", "11/11/1995",
                "01/01/2020",35000);

        System.out.println(jaime);
        System.out.println("Age : " + jaime.getAge());
        System.out.println("Pay : " + jaime.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                                                  "03/03/2021",15);
        System.out.println(mary);
        System.out.println("Mary Paycheck = $" + mary.collectPay());
        System.out.println("Mary Holiday Paycheck = $" + mary.getDoublePay());
    }
}
