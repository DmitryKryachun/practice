
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class testMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть номер замовлення  ");
        String number = scanner.nextLine();
        System.out.println("Введіть назву замовлення  ");
        String name = scanner.nextLine();
        System.out.println("Введіть курєра   ");
        String courier = scanner.nextLine();

        Order order = new Order(parseInt(number), name,courier );
        System.out.println("Введіть дату замовлення  ");
        order.setDateTime(scanner.nextLine());
        System.out.println("Введіть тип замовлення  ");
        order.setType(parseInt(scanner.nextLine()));

        System.out.println("Введіть номер студента  ");
        String id = scanner.nextLine();
        System.out.println("Введіть прізвище студента  ");
        String lastname = scanner.nextLine();
        System.out.println("Введіть імя студента  ");
        String firstname = scanner.nextLine();
        System.out.println("Введіть групу студента  ");
        String group = scanner.nextLine();
        System.out.println("Введіть кафедру студента  ");
        String department = scanner.nextLine();

        Students student = new Students(parseInt(id), lastname, firstname, parseInt(group), department);
        System.out.println("Введіть дисципліну студента  ");
        String discipline = scanner.nextLine();
        System.out.println("Введіть оцінку студента  ");
        String mark = scanner.nextLine();
        System.out.println("Введіть викладача студента  ");
        String teacher = scanner.nextLine();

        student.setDiscipline(discipline);
        student.setMark(parseInt(mark));
        student.setNameTeacher(teacher);

        System.out.println("CONTACT: id, lastname, firstname, group, department, address");
        Contact contact = new Contact(parseInt(scanner.nextLine()),
                scanner.nextLine(),
                scanner.nextLine(),
                parseInt(scanner.nextLine()),
                scanner.nextLine(),
                scanner.nextLine());

        System.out.println("EMAIL|CONTACT: id, lastname, firstname, group, department, address, email");

        EmailContact emailContact = new EmailContact(parseInt(scanner.nextLine()),
                scanner.nextLine(),
                scanner.nextLine(),
                parseInt(scanner.nextLine()),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine());


        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objects.txt")))
        {
            oos.writeObject(emailContact);
            oos.writeObject(contact);
            oos.writeObject(student);
            oos.writeObject(order);


        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }




    }

    }


