package MySql;

import java.sql.*;
import java.util.Scanner;

public class TabloVeriEkleme_Guncellemem {
    private String k_adi="root";
    private String passaword="";
    private String host="localhost";
    private int port=3306;
    private Connection con=null;
    private String db_isim="demo";
    private Statement statement=null;

    public TabloVeriEkleme_Guncellemem() {
        String url="jdbc:mysql://"+host+":"+port+"/"+db_isim+"?useUnicode=true&characterEncoding=utf8";
        try {
            con= DriverManager.getConnection(url,k_adi,passaword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void veriEkle(){
        Scanner scn=new Scanner(System.in);
        System.out.print("Ad :");
        String ad=scn.nextLine();
        System.out.print("Soyad :");
        String soyad=scn.nextLine();
        System.out.print("Email :");
        String email=scn.nextLine();
        try {
            statement= con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            statement.executeUpdate("Insert Into calisanlar (ad,soyad,email) VALUES("+"'"+ad+"',"+"'"+soyad+"',"+"'"+email+"')");//eklemek için update denmeli
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Eklendi");
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
    }
    public void calisanGuncelle(){
        String sorgu="Update calisanlar Set email='cavci48.yz@gmail.com' where id=3";
        try {
            statement= con.createStatement();
            statement.executeUpdate(sorgu);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void calisanSil(){
        String sorgu="Delete from calisanlar where id>4";
        try {
            statement= con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            int deger=statement.executeUpdate(sorgu);
            System.out.println(deger+"Tane silindi...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        TabloVeriEkleme_Guncellemem t=new TabloVeriEkleme_Guncellemem();
        t.veriEkle();
        t.veriEkle();
        t.calisanGuncelle();
        t.calisanlariGetir();
        t.calisanSil();
        t.calisanlariGetir();
    }
}
