package task1;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ContactBook {

    //key - phone, value - name
    @Getter
    private Map<String, String> contacts;

    public ContactBook(Map<String, String> contacts) {
        this.contacts = contacts;
    }

    public ContactBook() {
        contacts = new HashMap<>();
    }

    /**
     * add new contact to book
     * @param name name
     * @param phone phone number
     */
    public void addContact(String name, String phone) {
            if (
                    contacts.values()
                    .stream()
                    .filter(x -> x.equals(phone))
                    .findFirst()
                    .isEmpty()
            )
                contacts.put(phone, name);
    }

    /**
     * get phone numbers array by contact name.
     * @param name name
     * @return phone numbers array or null if contact with this name does not exist
     */
    public String[] getNumbersByName(String name) {
        var phones = contacts.entrySet()
                .stream()
                .filter(x -> x.getValue().equals(name))
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
        return phones.length == 0 ? null : phones;
    }

    /**
     * get all contacts by part of the name
     * @param subName substring that will compare with names
     * @return array with found contacts
     */
    @SuppressWarnings("unchecked")
    public Map.Entry<String, String>[] getAllContactsByPartOfName(String subName) {
        var tmp = contacts.entrySet()
                .stream()
                .filter(x -> x.getValue().contains(subName))
                .toArray(Object[]::new);
        return (Map.Entry<String, String>[]) tmp;
    }
}
