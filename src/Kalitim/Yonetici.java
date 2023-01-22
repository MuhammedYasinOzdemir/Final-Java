package Kalitim;

public class Yonetici extends Calisan {//miras aldık
    private int sorumlu_kisi;// ek olarak özellik atarız
    public Yonetici(String isim,String departman,double maas,int sorumlu_kisi){
        super(isim, maas, departman);//super anahtar kelimesi miras aldığımız sınıfın consturacturunu calıştır ek olarak methodlarıda çalışırabilir thise benzer
        //this.isim=isim; privte olduğu için super anahtar kelimesini kullanmalıyız
        this.sorumlu_kisi=sorumlu_kisi;//ek olarak ozellik atarız
    }//mecbur consturartur tanımlamalıyız.
    public void bilgileri_goster(){//overriding yapıldı extend ettiğimizdeki metod iptal oldu
        super.bilgileri_goster();//extend ettiğimiz metodu suoele cağıdık veya getter setter lerle tekrar yazılabilir.
        System.out.println("Sorumlu olduğu kişi sayısı:"+sorumlu_kisi);
    }
    public void zam_yap(double zam){
        System.out.println("Çalışanlara zam yapıldı.");
    }
}
