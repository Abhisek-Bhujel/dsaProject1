package arrraylist.Mobile;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    /**
     * Adds a new contact if it does not already exist.
     * @param contact The contact to add.
     * @return True if the contact was added, false if it already exists.
     */
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    /**
     * Updates an existing contact with a new contact.
     * @param oldContact The existing contact.
     * @param newContact The new contact to replace the old contact.
     * @return True if the update was successful, false otherwise.
     */
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update was not successful.");
            return false;
        }

        myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName() + ".");
        return true;
    }

    /**
     * Removes an existing contact.
     * @param contact The contact to remove.
     * @return True if the contact was removed, false otherwise.
     */
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }

        myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    /**
     * Finds the index of a contact in the list.
     * @param contact The contact to find.
     * @return The index of the contact, or -1 if not found.
     */
    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    /**
     * Finds the index of a contact by name in the list.
     * @param contactName The name of the contact to find.
     * @return The index of the contact, or -1 if not found.
     */
    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Queries a contact by name.
     * @param name The name of the contact to query.
     * @return The contact if found, or null if not found.
     */
    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    /**
     * Prints the list of contacts.
     */
    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
