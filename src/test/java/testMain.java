
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


