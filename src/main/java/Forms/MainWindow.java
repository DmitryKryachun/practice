package Forms;

import Classes.ContactCollection;
import Classes.EmailContactCollection;
import Classes.OrderCollection;
import Classes.StudentsCollection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainWindow {
    public JPanel mainPanel;
    private JButton сontactButton;
    private JButton emailContactButton;
    private JButton orderButton;
    private JButton studentButton;
    private JButton вивідІнформаціїПроВсіButton;

    //collections

    private StudentsCollection studentsCollection = new StudentsCollection();
    private OrderCollection orderCollection = new OrderCollection();
    private EmailContactCollection emailContactCollection = new EmailContactCollection();
    private ContactCollection contactCollection = new ContactCollection();

    public MainWindow() {
        сontactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JFrame contactWindow = new JFrame("ContactEdit");
                contactWindow.setContentPane(new ContactEdit(contactCollection).mainPanel);
                contactWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                contactWindow.pack();
                contactWindow.setTitle("Додати контакт");
                contactWindow.setVisible(true);
                contactWindow.setBounds(300,300,600,500);
            }
        });
        emailContactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JFrame emailContactWindow = new JFrame("EmailContactEdit");
                emailContactWindow.setContentPane(new EmailContactEdit(emailContactCollection).mainPanel);
                emailContactWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                emailContactWindow.pack();
                emailContactWindow.setTitle("Додати email контакт");
                emailContactWindow.setVisible(true);
                emailContactWindow.setBounds(300,300,600,500);

            }
        });
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JFrame orderWindow = new JFrame("OrderEdit");
                orderWindow.setContentPane(new OrderEdit(orderCollection).mainPanel);
                orderWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                orderWindow.pack();
                orderWindow.setTitle("Додати замовлення");
                orderWindow.setVisible(true);
                orderWindow.setBounds(300,300,600,500);

            }
        });
        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JFrame studentWindow = new JFrame("StudentEdit");
                studentWindow.setContentPane(new StudentEdit(studentsCollection).mainPanel);
                studentWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                studentWindow.pack();
                studentWindow.setTitle("Додати студента");
                studentWindow.setVisible(true);
                studentWindow.setBounds(300,300,600,500);

            }
        });
        вивідІнформаціїПроВсіButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String text = new String("");
                text+= contactCollection.toString()+"\n"+
                        emailContactCollection.toString()+"\n"+
                        studentsCollection.toString()+"\n"+
                        orderCollection.toString();

                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, text, "Інфо", JOptionPane.INFORMATION_MESSAGE);

                try(FileOutputStream fos=new FileOutputStream("toString.txt"))
                {
                    byte[] buffer = text.getBytes();
                    fos.write(buffer, 0, buffer.length);
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                }
                System.out.println("The file has been written");
                }
        });

    }
}
