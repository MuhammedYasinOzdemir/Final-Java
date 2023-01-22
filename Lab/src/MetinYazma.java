import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class MetinYazma {
    public static void main(String[] args){
        FileOutputStream fos=null;
        try {

            File file=new File("dosya.txt");
            fos=new FileOutputStream(file);
            String metin="1234";
            String metin2="";
            Random rnd=new Random();
            Integer tem;
            for (int i=0;i<100;i++){
                tem=rnd.nextInt(10);
                metin2+=tem.toString();
                metin2+="\n";
            }

            fos.write(metin2.getBytes(StandardCharsets.UTF_8));
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

    }
}
