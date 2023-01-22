package Text_IO;

import java.io.*;
import java.util.Scanner;

public class FİleReader_And_BufferReaader {
    public static void main(String[] args){
        File file=new File("C:\\Users\\User\\Desktop\\javaa\\java\\src\\Text_IO\\ogrenciler.txt");
        File file2=new File("C:\\Users\\User\\Desktop\\javaa\\java\\src\\Text_IO\\numaralar.txt");
        try(FileReader reader=new FileReader(file);FileReader reader1=new FileReader(file2)){
            Scanner scn=new Scanner(reader);
            Scanner scn1=new Scanner(reader1);
            while (scn.hasNextLine()){//Satır kaldımı konrol eder
                //System.out.println(scn.nextLine());//satırları yazar
                String a= scn.nextLine();//next line iki kere çalışırsa sıkıntı çıkar
                if (a.split(",")[1].strip().equals("Bilgisayar Mühendisliği"))
                    System.out.println(a);
            }
            while (scn.hasNext()){
                System.out.println(scn.next());
            }
            while (scn1.hasNextInt()){
                System.out.println(scn1.nextInt());
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(file))){//aynı şeyi yapaar ama daha verimlidir tek tek çağırmaktansa topluca alır
            Scanner scn1=new Scanner(bufferedReader);
            while (scn1.hasNextLine()){
                System.out.println(scn1.nextLine());

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedWriter a=new BufferedWriter(new FileWriter(file,true))){
            a.write("Taner avni, Makine mühendisliği");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
