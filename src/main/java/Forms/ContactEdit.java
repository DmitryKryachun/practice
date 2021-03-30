package Forms;

import Classes.ContactCollection;

import javax.swing.*;
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
                contactCollection.addContact((Integer)spinner1.getValue(), textField1.getText(), textField2.getText(),(Integer)spinner2.getValue(),textField3.getText(),textField4.getText());
            }
        });
    }
}
