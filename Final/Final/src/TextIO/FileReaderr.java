package TextIO;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderr {
    public static void main(String[] args){
        String metin="";
        try(FileReader fos=new FileReader("dosya2.txt")){
            Scanner scn=new Scanner(fos);
            while (scn.hasNextLine()){
                metin+=scn.nextLine();
            }
            System.out.println(metin);
        }
        catch(FileNotFoundException e){

        }
        catch (IOException e){

        }
    }
}
