package Forms;

import Classes.ContactCollection;
import Classes.EmailContactCollection;
import Classes.OrderCollection;
import Classes.StudentsCollection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderEdit {
    private JButton додатиButton;
    private JTextField textField1;
    private JButton сортуватиКолекціюЗаNameButton;
    private JSpinner spinner1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    public JPanel mainPanel;

    private OrderCollection orderCollection;

    public OrderEdit(OrderCollection orderCollection) {

        this.orderCollection = orderCollection;
        сортуватиКолекціюЗаNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    orderCollection.sortByName();
            }
        });
        додатиButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                orderCollection.addOrder((Integer)spinner1.getValue(), textField1.getText(),
                        textField2.getText(), textField3.getText(), textField4.getText());
            }
        });
    }
}
