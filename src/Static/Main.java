package Static;

public class Main {
    //static anahtar kelimesi sınıfa özgü hale getirilir sınıfın her elemenaın için ortak yaoar.
    //program çalıştığında bellekte hemen oluşur
    public static void main(String[] args){//bellekte oluşması için static kullanılmalı
        System.out.println(Seyirci.seyirciSayısı);//class için her eleman içi ortak olduğu için classın ismiylede cağrılabilri
    Seyirci seyirci1=new Seyirci("Mehmet");
        System.out.println(seyirci1.seyirciSayısı);//aynı şeyi yazarlar
        System.out.println(Seyirci.seyirciSayısı);
    Seyirci seyirci2=new Seyirci("Mustafa");
        System.out.println(seyirci2.seyirciSayısı);
        System.out.println(seyirci2.getSeyirciSayısı());
        System.out.println(Seyirci.getSeyirciSayısı());//boylece privte yaparak guvenli bir şekilde çağrılır
        selamla();
        System.out.println(Math.PI);//mesala bu da erişelim diye sattic yazılmış
        //ctr basılı tutarak clasaa tıklanırsa clasaa gider
}
    public static void selamla(){//mainde static yazılamsının nedeni bellekte henuz olusmamamısndan dolayıdır ama static olursa bellekte oluşur
        System.out.println("merhaba");

    }
}