
import Classes.*;
import Forms.MainWindow;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class testMain {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        ContactCollection ccol = new ContactCollection();
//        EmailContactCollection ecol = new EmailContactCollection();
//        OrderCollection ocol = new OrderCollection();
//        StudentsCollection scol = new StudentsCollection();
//
//        for(int i=0;i<3;i++){
//            ccol.addContact();
//            ecol.addEmailContact();
//            ocol.addOrder();
//            scol.addStudent();
//        }
//
//        try(FileOutputStream fos=new FileOutputStream("toString.txt"))
//        {
//            // перевод строки в байты
//
//            String textInFile = new String("");
//
//            for (Contact cnt : ccol.getContactsCollection()){
//                textInFile += cnt.toString();
//            }
//
//            for (Students std : scol.getStudentsCollection()){
//                textInFile += std.toString();
//            }
//
//            for (EmailContact ecnt : ecol.getEmailContactsCollection()){
//                textInFile += ecnt.toString();
//            }
//
//            for (Order ord : ocol.getOrdersCollection()){
//                textInFile += ord.toString();
//            }
//
//            byte[] buffer = textInFile.getBytes();
//            fos.write(buffer, 0, buffer.length);
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("The file has been written");
//
//        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objects.txt")))
//        {
//            for (Contact cnt : ccol.getContactsCollection()){
//                oos.writeObject(cnt);
//            }
//
//            for (Students std : scol.getStudentsCollection()){
//                oos.writeObject(std);
//            }
//
//            for (EmailContact ecnt : ecol.getEmailContactsCollection()){
//                oos.writeObject(ecnt);
//            }
//
//            for (Order ord : ocol.getOrdersCollection()){
//                oos.writeObject(ord);
//            }
//        }
//        catch(Exception ex){
//
//            System.out.println(ex.getMessage());
//        }

        try {
            UIManager.setLookAndFeel((UIManager.getSystemLookAndFeelClassName()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame mainWindow = new JFrame("MainWindow");
        mainWindow.setContentPane(new MainWindow().mainPanel);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.pack();
        mainWindow.setTitle("Практика");
        mainWindow.setVisible(true);
        mainWindow.setBounds(300,300,500,400);

    }



}


