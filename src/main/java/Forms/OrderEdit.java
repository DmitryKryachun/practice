package Forms;

import Classes.ContactCollection;
import Classes.EmailContactCollection;
import Classes.OrderCollection;
import Classes.StudentsCollection;

import javax.swing.*;
import java.awt.*;
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

        spinner1.getEditor().getComponent(0).setBackground(new Color(104, 108, 109));
        spinner1.getEditor().getComponent(0).setForeground(new Color(255, 255, 255));

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

                if(!textField1.getText().equals("") && !textField2.getText().equals("") && !textField3.getText().equals("") && !textField4.getText().equals("") && !((Integer)spinner1.getValue()<=-1)){
                    orderCollection.addOrder((Integer)spinner1.getValue(), textField1.getText(),
                            textField2.getText(), textField3.getText(), textField4.getText());
                }
                else {
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Введіть інфо в всі поля. \n Перевірте правильність вводу.", "Інфо", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
