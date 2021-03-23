public class Contact {
    private int Id;
    private String firstName;
    private String lastName;
    private String address;

    static int staticId;

    public Contact(String firstName, String lastName, String address){

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.Id = staticId;
        staticId++;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Id=" + Id +
                ", ім'я ='" + firstName + '\'' +
                ", прізвище ='" + lastName + '\'' +
                ", адреса ='" + address + '\'' +
                '}';
    }
}
