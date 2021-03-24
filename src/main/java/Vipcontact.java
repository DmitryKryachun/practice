public class Vipcontact extends Contact{

    private String birthday;
    private int phoneNumber;

    public Vipcontact(String firstName, String lastName, String address, String birthday, int phoneNumber) {
        super(firstName, lastName, address);
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return super.toString()+ "  Vipcontact{" +
                "День народження ='" + birthday + '\'' +
                ", номер телефону =" + phoneNumber +
                '}';
    }
}
