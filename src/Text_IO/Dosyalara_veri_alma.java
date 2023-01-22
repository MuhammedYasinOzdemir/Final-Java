package Text_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Dosyalara_veri_alma {
    public static void main(String[] args){
        File file=new File("C:\\Users\\User\\Desktop\\javaa\\java\\src\\Text_IO\\dosya1.txt");
        FileInputStream fos=null;//dosya almak için referans olusturur
        try {
            fos=new FileInputStream(file);
            try {
                System.out.println((char) fos.read());//Tek bir byte okur
                System.out.println((char) fos.read());//Tek bir byte okur
                System.out.println((char) fos.read());//Tek bir byte okur
                fos.skip(-3);//nereye gideceği belirlenir 3 karekter geri gider
                //read okuyacak değer kalamdımı -1 dondurur
                int deger;
                String s="";
                while ((deger= fos.read())!=-1){
                    s+=(char) deger;//her bir karekteri alamya yarar
                }
                System.out.println(s);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (fos != null) {//dosya bossa doner
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }}
        }

    }
}
