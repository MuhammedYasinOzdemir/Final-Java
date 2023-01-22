package TextIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamm {
    public static void main(String[] args){
        String metin="";

        try(FileInputStream fos=new FileInputStream("dosya.txt")){
            int deger;
            while ((deger=fos.read())!=-1){
                metin+=(char) deger;
            }
            System.out.println(metin);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
