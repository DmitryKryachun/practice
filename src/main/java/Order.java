import java.io.Serializable;

public class Order implements Serializable {
    private static final long serialVersionUID = 3L;

    private int Id;
    private String name;
    private String courier;
    private String dateTime;
    private int type;

    public Order(int Id, String name, String courier){
        this.Id = Id;
        this.name = name;
        this.courier = courier;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Id=" + Id +
                ", назва ='" + name + '\'' +
                ", кур'єр =" + courier + '\'' +
                ", дата ='" + dateTime + '\'' +
                ", тип =" + type +
                '}';
    }
}
