package Text_IO;

import java.io.*;
import java.sql.Time;
import java.util.ArrayList;

public class DosyaKopyala {
    public static ArrayList<Integer> dosyaOku(File file){
        FileInputStream fos=null;
        ArrayList<Integer> resim=new ArrayList<>();
        try {
            fos=new FileInputStream(file);
            int deger;
            while ((deger=fos.read())!=-1) {
                resim.add(deger);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return resim;
    }
    public static void dosyaYaz(File file,ArrayList<Integer> resim){
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(file);
            for(int i=0;i<resim.size();i++) {
                try {
                    fos.write(resim.get(i));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args){
        File alinan=new File("C:\\Users\\User\\Downloads\\yasin.jpg");
        File kopya=new File("C:\\Users\\User\\Desktop\\javaa\\java\\src\\Text_IO\\resim.jpg");
        ArrayList<Integer> resim=dosyaOku(alinan);
        System.out.println("Dosya alındı...");
        dosyaYaz(kopya,resim);
        System.out.println("Dosya kopyalandı...");
        for(Integer i=0;i<1000;i++){
            dosyaYaz(new File("C:\\Users\\User\\Desktop\\cc\\yasin"+i.toString()+".jpg"),resim);
            try {
                Thread.sleep(200);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
