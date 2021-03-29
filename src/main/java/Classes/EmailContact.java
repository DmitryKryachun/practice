package Classes;

import java.io.Serializable;

public class EmailContact extends Contact implements Serializable {

    private static final long serialVersionUID = 2L;
    private String email;

    public EmailContact(int idStudent, String lastName, String firstName, int group, String department, String address, String email) {
        super(idStudent, lastName, firstName, group, department, address);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + " Classes.EmailContact{" +
                "email='" + email + '\'' +
                '}';
    }
}
