package Interface;

public class IMuhendisTest {
    public static void main(String[] args){
            //IMuhendis m1 = new IMuhendis();interface den obje olusamaz
            Mühendis m2=new Mühendis(true,true);
            IMuhendis m3=new Mühendis(false,false);//ama interface implement edilen class laara referans olabilir.
            m2.adliSicilSorgula();
            m2.askerlikSorgula();
            m2.isTecrubesi(new String[]{"C", "python"});
            System.out.println(m2.mezuniyetOrtalamasi(92));
            m3.adliSicilSorgula();
            m3.askerlikSorgula();
            m3.isTecrubesi(new String[]{"Java", "c++"});
            System.out.println(m3.mezuniyetOrtalamasi(82));
            BilgisayarMühendisi m4=new BilgisayarMühendisi(true,false);
            m4.adliSicilSorgula();
            m4.askerlikSorgula();
            m4.isTecrubesi(new String[]{});
            m4.referans_getir(new String[]{"Ahmet","Mehmet"});
            m4.calis();//kendi clasında olana metodlarda herhangi bir sorun yok
            System.out.println(m4.mezuniyetOrtalamasi(82));
            IMuhendis m5=new BilgisayarMühendisi(false,true);
            m5.adliSicilSorgula();
            m5.askerlikSorgula();
            m5.isTecrubesi(new String[]{"Yok"});
            ((BilgisayarMühendisi)m5).referans_getir(new String[]{"Mustafa","Zeynep"});//implement edilen metodlarda olmadığı iöi hata alır casting uygularız
            ((BilgisayarMühendisi) m5).calis();//bunuda casting yapmalıyız normal clasa çünkü farklı implement
            System.out.println(m4.mezuniyetOrtalamasi(82));


    }
}
