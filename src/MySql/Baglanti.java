package MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//otamatik default kullanıcı adı:root
//şifre yok yani bos
public class Baglanti {
    private String k_adi="root";
    private String sifre="";
    private  String db_ismi="demo";//kurduğun veri tabanı ismi
    private String host="localhost";//internet bağlanmak farklı host ama
    private int port=3306;//yazar conrol panelede
    private Connection con=null;

    public Baglanti() {
        String url="jdbc:mysql://"+host+":"+port+"/"+db_ismi;
        //jdbc:mysql://localhost:3306/demo

        try {
            con= DriverManager.getConnection(url,k_adi,sifre);//veri tabanına bağlanır
            System.out.println("Bağlantı başarılı...");
        } catch (SQLException e) {
            System.out.println("Bağlantı başarısız...");//bağlanması için control panle den host açılması unutulmaması gerek

        }

    }
    public static void main(String[] args){
        Baglanti baglanti=new Baglanti();
    }
}
