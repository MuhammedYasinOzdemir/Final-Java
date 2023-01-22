package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Panel {
    public Panel() {
        JFrame f=new JFrame();
        JPanel panel=new JPanel();
        panel.setBounds(100,60,250,200);
        panel.setBackground(Color.YELLOW);
        panel.setFont(new Font("Times New Romab",Font.BOLD,14));
        panel.setBorder(BorderFactory.createLineBorder(Color.red,3));
        Button btn=new Button("Button 1");
        Button btn2=new Button("Button 2");
        btn.setBounds(50,100,80,25);
        btn2.setBounds(100,100,80,25);
        btn.setBackground(Color.red);
        btn2.setBackground(Color.green);
        panel.add(btn);panel.add(btn2);
        f.add(panel);
        f.setBounds(200,150,400,300);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String args[])
    {
        new Panel();
    }
}
