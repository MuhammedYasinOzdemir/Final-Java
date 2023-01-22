import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MetinOKuyupKopyalama {
    public static void main(String[] args){
        FileInputStream fos=null;
        File file=new File("dosya.txt");
        ArrayList<Integer> a=new ArrayList<>();
        try {
            fos=new FileInputStream(file);
            int deger;
            while ((deger=fos.read())!=-1){
                a.add(deger);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        Integer t=0,ort=0,min=1,max=0,el=0;
        for(int i:a){
            if (i!=10){
             System.out.println(i-48);
            t+=(i-48);
            el++;
            if (min>(i-48)){
                min=(i-48);
            }
            else if(max<(i-48)){
                max=(i-48);
            }}
        }
        ort=t/el;
        FileOutputStream yaz=null;
        File file2=new File("dosya2.txt");
        try {
            yaz=new FileOutputStream(file2);
            yaz.write(("Toplam:"+t.toString()+"\n").getBytes());
            yaz.write(("Ortalama:"+ ort.toString()+"\n").getBytes(StandardCharsets.UTF_8));
            yaz.write(("Minumum:"+min.toString()+"\n").getBytes(StandardCharsets.UTF_8));
            yaz.write(("Maximum:"+max.toString()+"\n").getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        finally {
            if(yaz!=null){
                try {
                    yaz.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
