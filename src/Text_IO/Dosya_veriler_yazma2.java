package Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Dosya_veriler_yazma2 {
    public static void main(String[] args)
    {
        File file=new File("C:\\Users\\User\\Desktop\\javaa\\java\\src\\Text_IO\\dosya2.txt");
        FileOutputStream fos=null;
        String[] isimler={"Yasin","Mehmet","Sümeyye","Erva","Eyüp","Gıcık sümeyye"};
        Random rnd=new Random();
        Integer[] yaslar=new Integer[isimler.length];
        for (int i=0;i<yaslar.length;i++){
            yaslar[i]=rnd.nextInt(100);
        }
        try {
            fos=new FileOutputStream(file);
            String s;
            for(Integer i=0;i<yaslar.length;i++){
                s=i.toString()+" - "+isimler[i]+"\t\t\t"+yaslar[i].toString()+"\n\n";
                try {
                    fos.write(s.getBytes(StandardCharsets.UTF_8));
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
}
