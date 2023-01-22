import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NotCekme {
    public static void main(String [] args){
        File file=new File("C:\\Users\\User\\Desktop\\javaa\\java\\src\\dosya.txt");
        ArrayList<Double[]> notlar=new ArrayList<>();
        ArrayList<String > kisiler=new ArrayList<>();
        try(FileReader reader=new FileReader(file)){
            Scanner scn=new Scanner(reader);
            while (scn.hasNextLine()){
                String[] s=scn.nextLine().split(",");
                Double[] d={Double.parseDouble(s[1]),Double.parseDouble(s[2]),Double.parseDouble(s[3])};
                notlar.add(d);
                kisiler.add(s[0]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int t;
        for(int i=0;i<kisiler.size();i++){
            t=0;
            System.out.println(kisiler.get(i));
            System.out.print("Notlar:");
            for(int j=0;j<3;j++){
                System.out.print(notlar.get(i)[j]+", ");
                t+=notlar.get(i)[j];
            }
            System.out.println("\nOrtalama : "+t/3.0+"\n\n*********************************\n");
        }
        try(FileWriter writer=new FileWriter("notlar.txt")){
            writer.write("****************** Notlar ******************\n\n");
            for(int i=0;i<kisiler.size();i++){
                t=0;
                writer.write(kisiler.get(i)+"\n");
                writer.write("Notlar:");
                for(int j=0;j<3;j++){
                    writer.write(notlar.get(i)[j]+", ");
                    t+=notlar.get(i)[j];
                }
                writer.write("\nOrtalama : "+t/3.0+"\n\n*********************************\n\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
