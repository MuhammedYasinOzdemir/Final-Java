package MySql;

import java.sql.*;

public class TabloVeriCekme {
    private String k_adi="root";
    private String passaword="";
    private String host="localhost";
    private int port=3306;
    private Connection con=null;
    private String db_isim="demo";
    private Statement statement=null;//sql sorgularini çalıştırmaya yarar

    public TabloVeriCekme() {
        String url="jdbc:mysql://"+host+":"+port+"/"+db_isim;
        try {
            con= DriverManager.getConnection(url,k_adi,passaword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //not veri tabanında id primary yapı otamaitk arttırma seçilrse sıralı eklenir
    }
    public void calisanlariGetir(){
        String sorgu="Select *From calisanlar";
        try {
            statement=con.createStatement();//baglantı üzerinde statement elde edilir
            ResultSet rs=statement.executeQuery(sorgu);//sorguyu işler ve resultsete depolar
            while (rs.next()){//daha okuyacağımız veri varmı kontrol eder
                int id=rs.getInt("id");//int değer alır idyi alır isme gore
                String ad=rs.getString("ad");
                String soyad=rs.getString("soyad");
                String email=rs.getString("email");
                System.out.println("\nId : "+id+"\nAd : "+ad+"\nSoyad : "+soyad+"\nEmail : "+email);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String sorgu2="Select * From calisanlar where id>2";//id si ikiden buyukleri çağırır
        try {
            //statement= con.createStatement();
            ResultSet rs=statement.executeQuery(sorgu2);
            while (rs.next()){//daha okuyacağımız veri varmı kontrol eder
                int id=rs.getInt("id");//int değer alır idyi alır isme gore
                String ad=rs.getString("ad");
                String soyad=rs.getString("soyad");
                String email=rs.getString("email");
                System.out.println("\nId : "+id+"\nAd : "+ad+"\nSoyad : "+soyad+"\nEmail : "+email);

        } }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args){
        TabloVeriCekme baglanti=new TabloVeriCekme();
        baglanti.calisanlariGetir();
    }
}
