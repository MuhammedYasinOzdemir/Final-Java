package Swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Table {
    public static void main(String[] args){
        JFrame jFrame=new JFrame("Table");
        String[][] data={ {"101","Amit","670000"},
                {"102","Jai","780000"},
                {"101","Sachin","700000"}};
        //tablo elamnları datda depolanır
        String[] column={"ID","NAME","SALARY"};
        //tablonun baslıkları column tutulur
        JTable table=new JTable(data,column);
        //tablo oluşturur
        ListSelectionModel model=table.getSelectionModel();
        model.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        model.addListSelectionListener(new ListSelectionListener() {//Hangi elman secilir bulur
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String eleman = null;
                int[] row = table.getSelectedRows();
                int[] columns = table.getSelectedColumns();
                for (int i = 0; i < row.length; i++) {
                    for (int j = 0; j < columns.length; j++) {
                        eleman = (String) table.getValueAt(row[i], columns[j]);
                    }
                    System.out.println("Secilen elmeman "  + eleman);
                }
            }});
            JScrollPane pane=new JScrollPane(table);
            jFrame.add(pane);
            jFrame.setBounds(300,250,400,400);
            jFrame.setVisible(true);
    }
}
