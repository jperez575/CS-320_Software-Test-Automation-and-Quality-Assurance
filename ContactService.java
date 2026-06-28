import java.util.ArrayList;

/** Service class for managing Contact objects */

public class ContactService {

    private ArrayList<Contact> list = new ArrayList<Contact>();

    /** Add contact with unique ID */
    public boolean addContact(Contact contact) {

        for (Contact c : list) {
            if (contact.getId().equals(c.getId())) {
                return false;
            }
        }

        list.add(contact);
        return true;
    }

    /** Delete contact by ID */
    public boolean deleteContact(String id) {

        for (Contact c : list) {
            if (c.getId().equals(id)) {
                list.remove(c);
                return true;
            }
        }

        return false;
    }

    /** Update contact first name */
    public boolean updateFirstName(String id, String firstName) {

        for (Contact c : list) {
            if (c.getId().equals(id)) {
                c.setFirstName(firstName);
                return true;
            }
        }

        return false;
    }

    /** Update contact last name */
    public boolean updateLastName(String id, String lastName) {

        for (Contact c : list) {
            if (c.getId().equals(id)) {
                c.setLastName(lastName);
                return true;
            }
        }

        return false;
    }

    /** Update contact phone number */
    public boolean updatePhoneNumber(String id, String phoneNumber) {

        for (Contact c : list) {
            if (c.getId().equals(id)) {
                c.setPhoneNumber(phoneNumber);
                return true;
            }
        }

        return false;
    }

    // Update address
    public boolean updateAddress(String id, String address) {

        for (Contact c : list) {
            if (c.getId().equals(id)) {
                c.setAddress(address);
                return true;
            }
        }

        return false;
    }
}