package Swing;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OptionPane extends WindowAdapter {
    JFrame f;
    public OptionPane() {
         f=new JFrame();
        f.addWindowListener(this);
        JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
        String name=JOptionPane.showInputDialog(f,"Enter Name");
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        System.out.println(name);
        f.setSize(300,330);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void windowClosing(WindowEvent e) {
        int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
        if(a==JOptionPane.YES_OPTION){
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    //Kaydetme bolumu
    public static void main(String[] args) {
        new  OptionPane();
    }
}
