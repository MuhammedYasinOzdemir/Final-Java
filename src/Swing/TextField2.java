package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField2 implements ActionListener {
    static JTextField tf1,tf2,tf3;
    static JButton b1,b2;
    public TextField2(){
        JFrame jFrame =new JFrame("Text field");
        tf1=new JTextField();
        tf1.setBounds(50,50,150,25);
        tf1.setBackground(Color.YELLOW);
        tf2=new JTextField();
        tf2.setBounds(50,100,150,25);
        tf2.setBackground(Color.green);
        tf3=new JTextField();
        tf3.setBounds(50,150,150,25);
        tf3.setBackground(Color.cyan);
        tf3.setEditable(false);//değiltirelemz sekilde dir
        b1=new JButton("+");
        b1.setBounds(50,200,50,50);
        b2=new JButton("-");
        b2.setBounds(120,200,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        jFrame.add(tf1);
        jFrame.add(tf2);
        jFrame.add(tf3);
        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.setBounds(400,250,640,480);
        jFrame.setLayout(null);
        jFrame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }else if(e.getSource()==b2){
            c=a-b;
        }
        String result=String.valueOf(c);
        tf3.setText(result);
    }
    public static void main(String[] args){
        new TextField2();
    }
}
