package Forms;

import Classes.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MainWindow extends JFrame{
    public JPanel mainPanel;
    private JButton сontactButton;
    private JButton emailContactButton;
    private JButton orderButton;
    private JButton studentButton;
    private JButton вивідІнформаціїПроВсіButton;
    private JButton завантаженняКолекційButton;
    private JButton збереженняВТекстButton;
    private JButton збереженняКолекційButton;
    //private ImageIcon ico = new ImageIcon(super.getClass().getClassLoader().getResource("images/edit.png"));

    //collections

    private StudentsCollection studentsCollection = new StudentsCollection();
    private OrderCollection orderCollection = new OrderCollection();
    private EmailContactCollection emailContactCollection = new EmailContactCollection();
    private ContactCollection contactCollection = new ContactCollection();
    //private ImageIcon ico = new ImageIcon(getClass().getClassLoader().getResource("resources/images/icon.png"));

    public MainWindow() {
       // this.setIconImage(ico.getImage());
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


                }

        });

        завантаженняКолекційButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FileInputStream fileInputStream = null;
                try {

                    fileInputStream = new FileInputStream("objects.txt");
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                    contactCollection = (ContactCollection) objectInputStream.readObject();
                    emailContactCollection = (EmailContactCollection) objectInputStream.readObject();
                    studentsCollection = (StudentsCollection) objectInputStream.readObject();
                    orderCollection = (OrderCollection) objectInputStream.readObject();

                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Успішно завантажено!", "Інфо", JOptionPane.INFORMATION_MESSAGE);

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });
        збереженняВТекстButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = new String("");
                text+= contactCollection.toString()+"\n"+
                        emailContactCollection.toString()+"\n"+
                        studentsCollection.toString()+"\n"+
                        orderCollection.toString();

                try(FileOutputStream fos=new FileOutputStream("toString.txt"))
                {
                    byte[] buffer = text.getBytes();
                    fos.write(buffer, 0, buffer.length);
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Операція успішна!", "Інфо", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                }
                System.out.println("The file has been written");
            }
        });
        збереженняКолекційButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objects.txt")))
                {

                    oos.writeObject(contactCollection);
                    oos.writeObject(emailContactCollection);
                    oos.writeObject(studentsCollection);
                    oos.writeObject(orderCollection);
                    oos.close();

                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Успішно збережено!", "Інфо", JOptionPane.WARNING_MESSAGE);
                }
                catch(Exception ex){

                    System.out.println(ex.getMessage());
                }
            }
        });
    }
}
