package Text_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_veri_yazma {
    //Input output Fİleinea benzer ama her veriyi alamk kolay değil

    public static void main(String[] args){
        FileWriter writer=null;
        try {
            writer=new FileWriter("C:\\Users\\User\\Desktop\\javaa\\java\\src\\Text_IO\\dosya3.txt");
            writer.write("Merhaba\n");
            writer.write("Muhammed Yasin\n");//Direk String alır
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(writer!=null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        FileWriter writer2=null;
        try {
            writer2=new FileWriter("C:\\Users\\User\\Desktop\\javaa\\java\\src\\Text_IO\\dosya3.txt",true);//uzerine ekler
            writer2.write("Ahmet");
            writer2.write("Yas:"+new String(String.valueOf(18)) );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(writer!=null) {
                try {
                    writer2.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
