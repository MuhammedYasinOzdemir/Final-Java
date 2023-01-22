package Swing;

import javax.swing.*;

public class TabbedPane {
    //Panllere sekme ekler
    public TabbedPane() {
        JFrame f=new JFrame();
        JTextArea textArea=new JTextArea(200,200);
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        p1.add(textArea);
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(50,50,200,200);
        tp.add("Anasayfa",p1);
        tp.add("Ayarlar",p2);
        tp.add("Yardım",p3);
        f.add(tp);
        f.setBounds(300,200,400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new TabbedPane();
    }
}
