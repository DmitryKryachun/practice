package Comparators;

import Classes.Contact;

import java.util.Comparator;


public class SortById implements Comparator<Contact> {
    @Override
    public int compare(Contact contact, Contact t1) {
        return new Integer(contact.getId()).compareTo(new Integer(t1.getId()));
    }
}
