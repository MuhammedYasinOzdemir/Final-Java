package TextIO;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterr {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String  metin=scn.nextLine();
        try(FileWriter fos=new FileWriter("dosya2.txt")){
            fos.write(metin);
        }
        catch (FileNotFoundException e){

        }
        catch (IOException e){

        }
    }
}
