package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Label extends JFrame {
    static JTextField tf; static JLabel l; static  JButton b;
    public Label(String title) throws HeadlessException {
        super(title);
    }
    public static void main(String[] args){
        Label stage=new Label("Label");
        Label stage2=new Label("Label 2");
        JLabel l1=new JLabel("Label 1");
        JLabel l2=new JLabel();
        l2.setText("Label 2");
        l2.setBounds(20,40,60,12);
        l1.setBounds(20,20,60,12);
        l1.setBackground(Color.YELLOW);
        l1.setForeground(Color.RED);
        l1.setBorder(BorderFactory.createBevelBorder(4,Color.BLACK,Color.blue));
        tf=new JTextField();
        tf.setBounds(50,50, 150,20);
        l=new JLabel();
        l.setBounds(50,100, 250,20);
        b=new JButton("Find IP");
        b.setBounds(50,150,95,30);
        //ip bulucu
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String host=tf.getText();
                    String ip=java.net.InetAddress.getByName(host).getHostAddress();
                    l.setText("IP of "+host+" is: "+ip);
                }catch(Exception ex){System.out.println(ex);}
            }
        });
       stage2.add(b);
       stage2.add(l);
       stage2.add(tf);
        stage.add(l1);
        stage.add(l2);
        stage.setBounds(300,250,640,480);
        stage.setLayout(null);
        stage.setVisible(true);
        stage2.setBounds(600,250,640,480);
        stage2.setLayout(null);
        stage2.setVisible(true);

    }


}
