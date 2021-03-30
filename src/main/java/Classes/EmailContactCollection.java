package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class EmailContactCollection implements Serializable {
    private static final long serialVersionUID = 6L;
    private List<EmailContact> emailContactsCollection = new ArrayList<EmailContact>();

    public void addEmailContact(int id, String lst, String fst, int gr, String dp, String ad, String email){

        //Scanner scanner = new Scanner(System.in);
        System.out.println("EMAIL|CONTACT: id, lastname, firstname, group, department, address, email");

        EmailContact emailContact = new EmailContact(id,
                lst,
                fst,
                gr,
                dp,
                ad,
                email);
        emailContactsCollection.add(emailContact);
    }

    public List<EmailContact> getEmailContactsCollection() {
        return emailContactsCollection;
    }

    @Override
    public String toString() {
        String text = new String("Email contacts collection :\n");
        for(Contact ecnt : emailContactsCollection){
            text+=ecnt.toString()+"\n";
        }
        return text;
    }
}
