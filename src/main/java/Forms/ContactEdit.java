package Forms;

import Classes.ContactCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactEdit {
    private JButton додатиButton;
    private JTextField textField1;
    private JButton сортуватиКолекціюЗаContactIDButton;
    private JSpinner spinner1;
    private JTextField textField2;
    private JSpinner spinner2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton сортуватиКолекціюЗаFirstButton;
    public JPanel mainPanel;

    private ContactCollection contactCollection;

    public ContactEdit(ContactCollection contactCollection) {

        spinner1.getEditor().getComponent(0).setBackground(new Color(104, 108, 109));
        spinner2.getEditor().getComponent(0).setBackground(new Color(104, 108, 109));
        spinner2.getEditor().getComponent(0).setForeground(new Color(255, 255, 255));
        spinner1.getEditor().getComponent(0).setForeground(new Color(255, 255, 255));

        this.contactCollection = contactCollection;

        сортуватиКолекціюЗаContactIDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                contactCollection.sortById();
            }
        });
        сортуватиКолекціюЗаFirstButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                contactCollection.sortByFirstName();
            }
        });
        додатиButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!textField1.getText().equals("") && !textField2.getText().equals("") && !textField3.getText().equals("") && !textField4.getText().equals("") && !((Integer)spinner1.getValue()<=-1) && !((Integer)spinner2.getValue()<=0)){
                    contactCollection.addContact((Integer)spinner1.getValue(), textField1.getText(), textField2.getText(),(Integer)spinner2.getValue(),textField3.getText(),textField4.getText());
                }
                else {
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Введіть інфо в всі поля. \n Перевірте правильність вводу.", "Інфо", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
