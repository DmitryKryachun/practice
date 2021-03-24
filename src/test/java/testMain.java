

public class testMain {

    public static void main(String[] args) {

        Contact contact = new Contact("Dmitro", "Kryachun", "st. beregova,20");
        System.out.println(contact.toString());

        Contact contact2 = new Contact("Someone", "???", "st. Serious, 4");
        System.out.println(contact2.toString());

        Order order = new Order(0, "car","Anton" );
        order.setDateTime("10/11/21");
        order.setType(2);
        System.out.println(order.toString());

        Students student = new Students(0, "Шевченко", "Тарас", 34, "Каво");
        student.setDiscipline("ООП");
        student.setMark(5);
        student.setNameTeacher("Франко");
        System.out.println(student.toString());

        Vipcontact vipcontact = new Vipcontact("Дмитро", "Крячун", "вул. Берегова, 20", "11/12/13", 380976655);
        System.out.println(vipcontact.toString());

    }
}
