package Generic;
/*
Java sınıfları, Java programlama dili içinde kullanılan yapılar olarak tanımlanabilir. Bir sınıf, nesneler oluşturmak için kullanılan bir şablon olarak düşünülebilir. Sınıf, veri alanlarını ve işlevleri tanımlar. Nesneler, bu sınıftan oluşturulduğunda, sınıfın tanımına göre veri alanlarına ve işlevlere sahip olurlar. Örneğin, "Kitap" sınıfı ad, yazar, yayınevi gibi veri alanlarını içerebilir ve "Kitabın adını değiştir" gibi bir işlevi de içerebilir.




 */
public class GenericSinifolusturma {
    public static void main(String[] args) {
        String[] sarray = {"Mehmet", "Yasin", "Sümeyye", "Eren", "Zeynep", "Salih"};
        Integer[] iarray = {1, 56, 8, 82, 2};
        Ogrenci[] oarray = {new Ogrenci("Mustafa", "Yilmaz"), new Ogrenci("Yasin", "Ozdemir")};
        Yazdirma<String> stringYazdirma = new Yazdirma<>();//generic sınıf olusturulur
        Yazdirma<Integer> integerYazdirma = new Yazdirma<>();
        Yazdirma<Ogrenci> ogrenciYazdirma = new Yazdirma<>();
        stringYazdirma.Yazdir(sarray);
        System.out.println("*****************************************************");
        integerYazdirma.Yazdir(iarray);
        System.out.println("*****************************************************");
        ogrenciYazdirma.Yazdir(oarray);
    }
}
