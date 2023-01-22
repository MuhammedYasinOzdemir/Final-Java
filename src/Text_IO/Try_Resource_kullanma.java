package Text_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Try_Resource_kullanma {
    public static void main(String[] args){
        //try Resource fazla try cath kullanamdan kısayoldur
        //File Input vs OLuyır
        try(FileWriter writerad=new FileWriter("C:\\Users\\User\\Desktop\\javaa\\java\\src\\Text_IO\\adlar.txt"); FileWriter writeryas=new FileWriter ("C:\\Users\\User\\Desktop\\javaa\\java\\src\\Text_IO\\yaslar.txt") ){
            //; virgulle birçok girilebilir ayrılır refanslar bu şeklde birden çok yapılabilr
            Scanner scn=new Scanner(System.in);
            for(int i=0;i<3;i++){
                System.out.print("Ad:");
                String ad=scn.nextLine();
                System.out.print("Yas:");
                int yas=scn.nextInt();
                scn.nextLine();
                writerad.write(String.valueOf(i+1)+" - "+ad+"\n\n");
                writeryas.write(String.valueOf(i+1)+" - "+String.valueOf(yas)+"\n\n");
            }
        } catch (IOException e) {
            System.out.println("Hata olustu");
        }

    }
}
