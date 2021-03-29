package Classes;

import Comparators.SortByFirstName;
import Comparators.SortById;

import java.io.Serializable;
import java.util.*;

import static java.lang.Integer.parseInt;

public class ContactCollection implements Serializable {


    private ArrayList<Contact> contactsCollection = new ArrayList<Contact>();
    private static final long serialVersionUID = 5L;

    public void addContact(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("CONTACT: id, lastname, firstname, group, department, address");
        Contact contact = new Contact(parseInt(scanner.nextLine()),
                scanner.nextLine(),
                scanner.nextLine(),
                parseInt(scanner.nextLine()),
                scanner.nextLine(),
                scanner.nextLine());

        contactsCollection.add(contact);
    }

    public void sortByFirstName(){
        Collections.sort(contactsCollection, new SortByFirstName());
    }

    public void sortById(){
        Collections.sort(contactsCollection,new SortById());
    }

    @Override
    public String toString() {
        String text = new String("Contact collection :\n");
        for(Contact cnt : contactsCollection){
            text+=cnt.toString()+"\n";
        }
        return text;
    }

    public ArrayList<Contact> getContactsCollection() {
        return contactsCollection;
    }
}
