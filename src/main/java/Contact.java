import java.io.Serializable;

public class Contact extends Students implements Serializable {
    private static final long serialVersionUID = 1L;
    private int Id;

    private String address;

    private static int staticId;

    public Contact(int idStudent, String lastName, String firstName, int group, String department, String address) {
        super(idStudent, lastName, firstName, group, department);
        this.Id = staticId;
        staticId++;
        this.address = address;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getStaticId() {
        return staticId;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Id контакта=" + Id +
                ", адреса='" + address + '\'' +
                '}'+"  " +super.toString();
    }
}
