package arrraylist.Mobile;

public class Main {
    public static void main(String[] args) {
        Contact c = new Contact("Azize", "7035594502");
        MobilePhone mp = new MobilePhone("7035594501");
        mp.addNewContact(c);
        mp.printContacts();
    }
}
