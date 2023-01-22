package Soru2_171421005;

public class Test {
    //Muhammed Yasin Özdemir
    //171421005
    public static void main(String[] args){
        Goruntu goruntu=new Goruntu("Resim",4,6,"Siyah");//Goruntu objesi olusturuluyır
        System.out.println("\nGoruntu boyutu(boyutHesapla):"+goruntu.boyutHesapla());//boyutu boyut hesapla metodu ile alır
        System.out.println("Goruntu boyutu(getBoyut):"+goruntu.getBoyut());//boyutu getter metedu ile alir
        goruntu.goster();
        System.out.println("Goruntu Boyutu(%25 azaltılmış):"+goruntu.boyutAzalt());//goruntu boyutu %25 azaltılıp botutu sındururu method
        goruntu.goster();
        //Harf objeleri tanımlanıyor
        Harf a=new Harf("sesli","a");
        Harf b=new Harf("sessiz","b");
        Harf c=new Harf("sessiz","c");
        Harf d=new Harf("sessiz","d");
        Harf e=new Harf("sesli","e");
        Harf y=new Harf("sessiz","y");
        Harf s=new Harf("sessiz","s");
        Harf i=new Harf("sesli","i");
        Harf n=new Harf("sesli","n");
        Harf t=new Harf("sessiz","t");
        Harf l=new Harf("sessiz","l");
        Harf k =new Harf("sessiz","k");
        System.out.println("Toplam "+(int)Harf.getBoyut()+" harf tanımlandı");
        //Hece objeleri tanımlanıyor
        Hece hece1=new Hece();
        Hece hece2=new Hece();
        Hece hece3=new Hece();
        Hece hece4=new Hece();
        Hece hece5=new Hece();
        Hece hece6=new Hece();
        //Metin objeleri tanımlanıyor
        Metin metin1=new Metin();
        Metin metin2=new Metin();
        Metin metin3=new Metin();
        //Hece objelerine harf ekleme yapılıyor.
        hece1.harfEkle(s);
        hece1.harfEkle(a);//hece1:sa
        hece2.harfEkle(d);
        hece2.harfEkle(e);//hece2:de
        hece3.harfEkle(c);
        hece3.harfEkle(e);//hece3:ce
        System.out.println("\nhece1:");
        hece1.goster(); //hece1 gosterir
        //Metin objesine oluşturlan Hece objelerini ekleniyor.
        metin1.heceEkle(hece1);
        metin1.heceEkle(hece2);
        metin1.heceEkle(hece3);//metin1:sadece
        System.out.println("\n\nmetin1:");
        metin1.goster();
        //Metin objesinden hece silme yapılıyor
        metin1.heceSil(hece3);
        System.out.println("\n\nmetin1(Hece silinmis):");
        metin1.goster();//metin1:sade
        //Yasin ismi heceleri ile metne ekleniyor.
        hece4.harfEkle(y);
        hece4.harfEkle(a);//hece4:ya
        hece5.harfEkle(s);
        hece5.harfEkle(i);
        hece5.harfEkle(n);//hece5::sin
        metin2.heceEkle(hece4);
        metin2.heceEkle(hece5);
        System.out.println("\n\nmetin2:");
        metin2.goster();//yasin
        //Hece silinip yeni Hece objesi olusturuluyor
        hece1.sil();//hece1 içi bosaltilir
        hece1.harfEkle(t);  //harfler ekleniyor...
        hece1.harfEkle(a);
        hece1.harfEkle(s);
        //Harfler ekleniyor...
        hece6.harfEkle(l);
        hece6.harfEkle(i);
        hece6.harfEkle(k);  //hece6:lik
        //Heceler ekleniyor...
        metin3.heceEkle(hece1);
        metin3.heceEkle(hece6); //metin3:taslik
        System.out.println("\n\nmetin3:");
        metin3.goster();
        //Metin içindeki harf silme islemi yapılıyor...
        metin3.heceSil(hece6);
        System.out.println("\n\nhece6:");
        hece6.goster();
        System.out.println("\n\nhece6(Harf silinmis):");
        hece6.harfSil(k);//hece6:li olur
        hece6.goster();
        metin3.heceEkle(hece6);//lik li yapıldı hece değişti.
        System.out.println("\n\nmetin3(Harf silinmis):");
        metin3.goster();//metin3:tasli
    }
}
