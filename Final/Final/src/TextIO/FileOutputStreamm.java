package TextIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileOutputStreamm {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Metin :");
        String metin=scn.nextLine();
        try(FileOutputStream fileOutputStream=new FileOutputStream("dosya.txt")){
            fileOutputStream.write(metin.getBytes(StandardCharsets.UTF_8));
            System.out.println("Yazildi");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
