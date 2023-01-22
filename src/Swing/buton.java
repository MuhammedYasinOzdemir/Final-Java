package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buton extends JFrame {
    public buton(String title) throws HeadlessException {
        super(title);
    }
    public static void main(String[] args){
        buton buton=new buton("Buton oluşturma");
        JButton button=new JButton("Ok");
        button.setBounds(50,100,60,30);//sol ust kose,widht height
        button.setBackground(Color.yellow);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Times New Roman",Font.PLAIN,14));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Butona tıklandı...");
            }
        });
buton.add(button);
        buton.setSize(400,400);//sırası çok önemle
        buton.setLayout(null);//null yapılmassa ekran kaplar
        buton.setVisible(true);//ikisi yer değişince çok şey değişiyot
        //!Sıra boyle olmalı

        ;
    }
}
