package MySql;

import java.sql.*;
import java.util.Scanner;

public class PreperedStatment {
    private String k_adi="root";
    private String passaword="";
    private String host="localhost";
    private int port=3306;
    private Connection con=null;
    private String db_isim="demo";
    private Statement statement=null;
    PreparedStatement preperedStatment=null;
    Scanner scn=new Scanner(System.in);
    public PreperedStatment() {
        String url="jdbc:mysql://"+host+":"+port+"/"+db_isim;
        try {
            con= DriverManager.getConnection(url,k_adi,passaword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void calisanlariGetir(){
        String sorgu="Select * From calisanlar";
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
    }
    public void calisanEKle(){
        String sorgu="Insert Into calisanlar (ad,soyad,email) Values(?,?,?)";
        try {
            con.setAutoCommit(false);
            Scanner scn=new Scanner(System.in);
            System.out.print("Ad :");
            String ad=scn.nextLine();
            System.out.print("Soyad :");
            String soyad=scn.nextLine();
            System.out.print("Email :");
            String email=scn.nextLine();
             preperedStatment=con.prepareStatement(sorgu);
             preperedStatment.setString(1,ad);
             preperedStatment.setString(2,soyad);
             preperedStatment.setString(3,email);
             preperedStatment.executeUpdate();
            System.out.print("Sec:");
            String sec= scn.nextLine();
            if(sec.equals("yes")){
                con.commit();//yapılan işlemleri uygular
            }
            else {
                con.rollback();//yapılan şlemeleri uygulamaz
                //Kaydet butonu gibi
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void calisanGoster(){
        String sorgu="Select * from calisanlar where ad like ?";
        try {

            preperedStatment=con.prepareStatement(sorgu);
            preperedStatment.setString(1,"E%");//e ile başlayanları alır % işareti devamı var demek
            ResultSet rs=preperedStatment.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("ad"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    void calisanSil(){
        String sorgu="Delete from calisanlar where id=?";
        try {
            con.setAutoCommit(false);//Yapılan işlemi otamatik yapmasını engeller
            preperedStatment=con.prepareStatement(sorgu);
            preperedStatment.setInt(1,3);//baslanan konum,girilecek elema
            preperedStatment.executeUpdate();
            System.out.print("Sec:");
            String sec= scn.nextLine();
            if(sec.equals("yes")){
                con.commit();//yapılan işlemleri uygular
            }
            else {
                con.rollback();//yapılan şlemeleri uygulamaz
                //Kaydet butonu gibi
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    void calisanGuncelle(){

        String sorgu="Update calisanlar Set ad=?,soyad=?,email=? where ad=?";
        try {
            con.setAutoCommit(false);
            preperedStatment= con.prepareStatement(sorgu);
            preperedStatment.setString(1,"Mehmet");
            preperedStatment.setString(2,"Kaya");
            preperedStatment.setString(3,"mehmetkaya@gmail.com");
            preperedStatment.setString(4,"s");
            preperedStatment.executeUpdate();
            System.out.print("Sec:");
            String sec= scn.nextLine();
            if(sec.equals("yes")){
                con.commit();//yapılan işlemleri uygular
            }
            else {
                con.rollback();//yapılan şlemeleri uygulamaz
                //Kaydet butonu gibi
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        PreperedStatment a=new PreperedStatment();
        a.calisanGoster();
        a.calisanEKle();
        a.calisanlariGetir();
        a.calisanSil();
        a.calisanlariGetir();
        a.calisanGuncelle();
        a.calisanlariGetir();
    }

}
