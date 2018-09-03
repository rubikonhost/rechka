package ru.konsantin.io;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        super("Simple Example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        Container contentPane = getContentPane();
        contentPane.add(new JLabel("456"));
        JButton button = new JButton("123");
        button.setSize(10,5);
        contentPane.add(button);
        setVisible(true);
    }
}
