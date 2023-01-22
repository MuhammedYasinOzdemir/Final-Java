package Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Table2 {
    JTable table;
    JTextField textField;
    JTextField textField2;
    JButton button;
    JButton button2;
    JButton button3;
    public Table2() {
       textField=new JTextField();
        textField2=new JTextField();
        Object elemanlar[][]=null;

        String[] basliklar={"Ad","Soyad"};
        DefaultTableModel model=new DefaultTableModel(elemanlar,basliklar);
        table=new JTable();
        table.setModel(model);
        //Tablo genelde scroll panlede yapılır
        button=new JButton("Ekle");
        button2=new JButton("Sil");
        button3=new JButton("Guncelle");
        button.setBounds(20,300,80,25);
        button2.setBounds(120,300,80,25);
        button3.setBounds(220,300,80,25);
        textField=new JTextField();
        textField.setBounds(50,50,200,25);
        textField2=new JTextField();
        textField2.setBounds(50,100,200,25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elemanEkle();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elemanSil();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elemanGuncelle();
            }
        });
        JScrollPane pane=new JScrollPane(table);
        pane.setBounds(320,200,400,300);
        JFrame f=new JFrame("Table");
        f.add(pane);
        f.add(button);
        f.add(button2);
        f.add(button3);
        f.add(textField);
        f.add(textField2);
        f.setBounds(200,300,800,600);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void elemanEkle(){
           Object[] eklencekler={textField.getText(),textField2.getText()};
            DefaultTableModel model= (DefaultTableModel) table.getModel();
            model.addRow(eklencekler);
    }
    public void elemanSil(){
        int secilirow=table.getSelectedRow();
        DefaultTableModel model= (DefaultTableModel) table.getModel();
        if(secilirow!=-1){
            model.removeRow(secilirow);
        }
    }
    public void elemanGuncelle(){
        int secilirow=table.getSelectedRow();
        DefaultTableModel model= (DefaultTableModel) table.getModel();
        if(secilirow!=-1){
            model.setValueAt(textField.getText(),secilirow,0);
            model.setValueAt(textField2.getText(),secilirow,1);
        }
    }
    public static void main(String[] args){
        new Table2();
    }
}
