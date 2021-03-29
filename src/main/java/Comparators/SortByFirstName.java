package Comparators;

import Classes.Contact;

import java.util.Comparator;

public class SortByFirstName implements Comparator<Contact> {

    @Override
    public int compare(Contact contact, Contact t1) {
        return contact.getFirstName().compareTo(t1.getFirstName());
    }
}
