package Forms;

import Classes.EmailContactCollection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmailContactEdit {
    private JButton додатиButton;
    private JTextField textField1;
    private JSpinner spinner1;
    private JTextField textField2;
    private JSpinner spinner2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    public JPanel mainPanel;

    private EmailContactCollection emailContactCollection;

    public EmailContactEdit(EmailContactCollection emailContactCollection) {

        this.emailContactCollection = emailContactCollection;

        додатиButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                emailContactCollection.addEmailContact((Integer)spinner1.getValue(), textField1.getText(), textField2.getText(),(Integer)spinner2.getValue(),textField3.getText(),textField4.getText(),textField5.getText());
            }
        });
    }
}
