package bank;

public class Main {
    public static void main(String[] args) {
         Bank bank = new Bank();
         bank.setAccountBalance(50000);
         bank.setAccountNumber(7890);
         bank.setCustomerName("John Doe");
         bank.setEmail("jhon@gmail.com");
         bank.setPhoneNumber(7035597865d);

         bank.deposit(1000);
        System.out.println(bank.getAccountBalance());

        bank.withdraw(890);
        System.out.println(bank.getAccountBalance());

    }
}
