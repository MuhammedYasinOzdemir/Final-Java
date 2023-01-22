package Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Dosyalara_Veri_Yazma {
    public static void main(String[] args) {
        FileOutputStream fos = null, fos2 = null;  //referans olusturuyoz
        File file = new File("C:\\Users\\User\\Desktop\\javaa\\java\\src\\Text_IO\\dosya1.txt");//dosya adını verip açmaya yarıyor
        //w metodu
        try {
            fos = new FileOutputStream(file); //dosya referansa eşitlenir
            //not siler tekrar yükler w metedu gibi
            fos.write(65);//ascıı koda göre yazılır.
            String a = "merhaba";
            fos.write(a.getBytes(StandardCharsets.UTF_8));//ayı byte arrayine dönüstürüp yazar
        } catch (FileNotFoundException e) {
            System.out.println("Hata oluştu");
        } catch (IOException e) {
            System.out.println("Dosyaya yazılırken hata oluştu");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //a metodu
        File file2 = new File("C:\\Users\\User\\Desktop\\javaa\\java\\src\\Text_IO\\dosya1.txt");
        try {
            fos2 = new FileOutputStream(file2, true); //dosya referansa eşitlenir
            //üstüne akler true yazdığımız iççin a metodu
            String a = "Yasin";
            fos2.write(a.getBytes(StandardCharsets.UTF_8));//ayı byte arrayine dönüstürüp yazar
            Integer[] b={5,5,2};//stringe donusum yapılır sayılar yazlır.
            for(int i=0;i<b.length;i++)
                fos2.write(b[i].toString().getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            System.out.println("Hata oluştu");
        } catch (IOException e) {
            System.out.println("Dosyaya yazılırken hata oluştu");
        } finally {
            try {
                fos2.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
