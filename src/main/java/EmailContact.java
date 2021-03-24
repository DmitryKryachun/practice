public class EmailContact extends Contact{
    private String email;

    public EmailContact(String firstName, String lastName, String address, String email) {
        super(firstName, lastName, address);
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
        return super.toString() + " EmailContact{" +
                "email='" + email + '\'' +
                '}';
    }
}
