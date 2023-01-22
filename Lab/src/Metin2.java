import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Metin2 {
    public static void main(String[] args){
        FileOutputStream fos=null;
        try {

            File file=new File("dosya3.txt");
            fos=new FileOutputStream(file);
            String metin="Kırkdokuz yıl bu yollarda\n" +
                    "\n" +
                    "Ovada dağda çöllerde\n" +
                    "\n" +
                    "Düşmüşüm gurbet ellerde\n" +
                    "\n" +
                    "Gidiyorum gündüz gece";


            fos.write(metin.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            System.out.println("Dosya Açılmadı...");
        } catch (IOException e) {
            System.out.println("YAzılamadı");
        }
        finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        FileInputStream okuma=null;
        File file2=new File("dosya3.txt");
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> has=new HashMap<>();
        try {
            okuma=new FileInputStream(file2);
            int deger,c=0;

            has.put((int)'ç',0);
            has.put((int)'ı',0);
            has.put((int)'ö',0);
            has.put((int)'ü',0);
            while ((deger=okuma.read())!=-1){
                if (deger != 196 && deger!=(int)'ı' && deger!=(int)'ö' && deger!=(int)'ü'){
                    a.add(deger);
                }
                else {

                    c++;
                }
            }
            System.out.println(c);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(okuma!=null){
                try {
                    okuma.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        for(int i:a){
            System.out.print((char) i);
        }
        System.out.println("\nç  "+has.get((int)'ç'));


    }
}
