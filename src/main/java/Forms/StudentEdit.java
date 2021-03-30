package Forms;

import Classes.StudentsCollection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentEdit {
    private JButton додатиButton;
    private JTextField textField1;
    private JButton сортуватиКолекціюЗаMarkButton;
    private JSpinner spinner1;
    private JTextField textField2;
    private JSpinner spinner2;
    private JTextField textField3;
    private JTextField textField4;
    private JSpinner spinner3;
    private JTextField textField5;
    public JPanel mainPanel;

    private StudentsCollection studentsCollection;

    public StudentEdit(StudentsCollection studentsCollection) {

        this.studentsCollection = studentsCollection;

        додатиButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                studentsCollection.addStudent((Integer)spinner1.getValue(), textField1.getText(),
                        textField2.getText(), (Integer)spinner2.getValue(), textField3.getText(),
                        textField4.getText(), (Integer)spinner3.getValue(), textField5.getText());
            }
        });
        сортуватиКолекціюЗаMarkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    studentsCollection.sortByMark();
            }
        });
    }
}
