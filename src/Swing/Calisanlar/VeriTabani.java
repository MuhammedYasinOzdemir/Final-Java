package Swing.Calisanlar;

import java.sql.*;

public class VeriTabani {
    private static final String k_adi="root";
    private static final String sifre="";
    private  static final String db_ismi="calisanlar";//kurduğun veri tabanı ismi
    private static final String host="localhost";//internet bağlanmak farklı host ama
    private static final int port=3306;//yazar conrol panelede
    private Connection con=null;
    private PreparedStatement preparedStatement;

    public VeriTabani() {
        String url="jdbc:mysql://"+host+":"+port+"/"+db_ismi;
        try {
            con= DriverManager.getConnection(url,k_adi,sifre);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean kontrol(String k,String s){
        String sorgu="Select * From adminler where k_adi=? and sifre=?";
        try {
            preparedStatement= con.prepareStatement(sorgu);
            preparedStatement.setString(1,k);
            preparedStatement.setString(2,s);
            ResultSet rs=preparedStatement.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
