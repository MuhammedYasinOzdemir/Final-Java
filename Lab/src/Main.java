import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<evrak> evraklar = new ArrayList<>();
    static ArrayList<gorevli> gorevliler = new ArrayList<>();
    static ArrayList<kullanici> kullanicilar = new ArrayList<>();

    public static void belgeDogrula(){
        System.out.println("Belge Doğrulama Sistemine Hoş Geldiniz");
        System.out.println("Lütfen Doğrulama Kodunu Giriniz: ");
        int kod = secimAl();
        for (int i=0;i<evraklar.size();i++){
            if (kod==evraklar.get(i).getDogrulamaKod() && evraklar.get(i).isGecerlilik()){
                System.out.println("\nAranan Belge Doğrulandı !");
                System.out.println(evraklar.get(i).toString());
                break;
            }
            if (i == evraklar.size()-1){
                System.out.println("\nAranan Belge Doğrulanamadı!");
            }
        }
    }
    public static void kullaniciKayit(){
        System.out.println("\nKullanıcı Kayıt Sistemine Hoş Geldiniz");
        System.out.println("TC Numaranızı Giriniz: ");
        long tc = tcAl();
        input.nextLine();
        System.out.println("Adınızı Giriniz: ");
        String ad = input.nextLine();
        System.out.println("Soyadınızı Giriniz: ");
        String soyad = input.nextLine();
        System.out.println("Doğum Tarihinizi Giriniz(YYYY-AA-GG): ");
        String dTarih = input.nextLine();
        kullanicilar.add(new kullanici(tc,ad,soyad,dTarih));
        System.out.println("Kayıt Tamamlandı !");
        System.out.println("Kullanıcı Bilgileri: " +kullanicilar.get(kullanicilar.size()-1).toString());

    }
    public static int secimAl() {
        System.out.print("Lütfen Bir Seçim Yapınız: ");
        int tmp=20;

        while(true){
        try {
                input.nextLine();
             tmp = input.nextInt();
             break;
        }
        catch (Exception e){
            System.out.println();
        }}

        return tmp;

    }
    public static long tcAl(){
        long tmp = 0;
        System.out.print("TC Kimlik Numarası Giriniz: ");
        try{
            tmp = input.nextLong();
        }catch (Exception e){
            e.printStackTrace();
        }
        return tmp;
    }
    public static void kullaniciIslemleri(int index) {
        int secim, secim2;
        do {
            System.out.print("\nHoşgeldiniz " + kullanicilar.get(index).getAd() + " " + kullanicilar.get(index).getSoyAd());
            System.out.println(" Yapabileceğiniz İşlemler:");
            System.out.println("1- Evrak Oluştur");
            System.out.println("2- Oluşturulan Tüm Evrakları Görüntüle");
            System.out.println("3- Belirli Evrakı Görüntüle");
            System.out.println("4- Kullanıcı Bilgilerini Yazdır");
            System.out.println("0- Çıkış Yap");
            secim = secimAl();

            if (secim == 1) {
                do {
                    System.out.println("\nEvrak Türünü Seçiniz: ");
                    System.out.println("1-İkametgah Evrakı");
                    System.out.println("2-Ceza Evrakı");
                    System.out.println("3-Nüfus Evrakı");
                    System.out.println("4-Tapu Evrakı");
                    System.out.println("5-Taşıt Evrakı");
                    System.out.println("6-Gelir Evrakı");
                    System.out.println("0-Geri Dön");
                    secim2 = secimAl();
                    if (secim2 != 0) {
                        evraklar.add(new evrak(secim2, kullanicilar.get(index)));
                        secim2 = 0;
                    }
                }while (secim2!=0);
            }
            if (secim == 2) {
                for (int j = 0; j < evraklar.size(); j++) {
                    if (evraklar.get(j).getOlusturan().getTcNo() == kullanicilar.get(index).getTcNo()) {
                        System.out.println(evraklar.get(j).toString());
                    }
                }
            }
            if (secim == 3) {
                System.out.println("Görüntülemek İstediğiniz Evrakın Seri Numarasını Giriniz: ");
                secim2=secimAl();
                for (int i=0;i< evraklar.size();i++){
                    if (evraklar.get(i).getSeriNo()==secim2 && evraklar.get(i).getOlusturan().getTcNo()==
                    kullanicilar.get(index).getTcNo()){
                        System.out.println(evraklar.get(i).toString());
                        break;
                    }
                    else if (i==evraklar.size()-1){
                        System.out.println("Belirtilen Seri Numaraya Ait Evrak Bulunamadı !");
                        break;
                    }
                }
            }
            if (secim==4){
                System.out.println(kullanicilar.get(index).toString());
            }

        }while (secim != 0 );
    }
    public static void gorevliIslemleri (int index) {
        int secim, secim2,n=0;
        do {
            System.out.print("\nHoşgeldiniz " + gorevliler.get(index).getAd() + " " + gorevliler.get(index).getSoyAd());
            System.out.println(" Yapabileceğiniz İşlemler:");
            System.out.println("1- İmza Bekleyen Evrakları Görüntüle");
            System.out.println("2- İmza Bekleyen Evrakları İmzala");
            System.out.println("3- İmzalanan Evrakları Görüntüle");
            System.out.println("4- Belirlenen Evrakı Geçersiz Kıl");
            System.out.println("5- Görevli Bilgilerini Yazdır");
            System.out.println("0- Çıkış Yap");
            System.out.println("999 - İstifa Et ");
            secim = secimAl();
            if (secim==1){
                n=0;
                for (int i =0;i< evraklar.size();i++){
                    if (evraklar.get(i).getImzalayan()==null){
                        System.out.println(evraklar.get(i).toString());
                        n++;
                    }
                }
                if (n==0){
                    System.out.println("İmzalanacak Evrak Yoktur.");
                }
                else {
                    System.out.println(n+"Adet İmzalanacak Evrak Vardır.");
                }
            }
        }while(secim!=0);
    }

    public static void main(String[] args) {
        int secim=20,secim2=20,index;
        long tc;

        mudur eren = new mudur(12345678910L,"Emir","Doğan","05-05-2001",30000);
        gorevliler.add(new gorevli(12345678911L,"Hakan","Tunç","10-04-2002",6000));
        kullanicilar.add(new kullanici(10397188502L,"Eren","Doğan","12.07.2001"));
        /*
        // MAAŞ ARTTIRIP AZALTMA TEST
        System.out.println(gorevliler.get(0).toString());
        eren.maasArttir(gorevliler.get(0));
        System.out.println(gorevliler.get(0).toString());
        eren.maasAzalt(gorevliler.get(0));
        System.out.println(gorevliler.get(0).toString());
         */do{
        do{
            System.out.println("Merhaba Sisteme Hoşgeldiniz !");
            System.out.println("1 - Giriş Yap");
            System.out.println("2 - Üye Ol");
            System.out.println("3 - Doğrulama Kodu İle Belge Doğrula");
            System.out.println("0 - Çıkış Yap");
            try {
                secim = secimAl();
                break;
            }
            catch (Exception e){
                System.out.println(e);

            }

        }while (true);
            System.out.println(secim);

            if (secim == 1) {
                do {
                    System.out.println("1 - Kullanıcı Girişi");
                    System.out.println("2 - Görevli Girişi");
                    System.out.println("3 - Müdür Girişi");
                    System.out.println("0 - Geri Dön");
                    secim2 = secimAl();
                    if (secim2!=0){
                        tc = tcAl();
                        if (tc <=9999999999L || tc >99999999999L ) {//////////////////
                            System.out.println("TC Kimlik Numarasını Hatalı Girdiniz.");
                        }
                        else if (secim2==1) {
                            for (int i =0;i<kullanicilar.size();i++){
                                if (kullanicilar.get(i).getTcNo()==tc){
                                    System.out.println("Kullanıcı Bulundu");
                                    System.out.println("Giriş Yapılıyor");
                                    index = i;
                                    kullaniciIslemleri(index);
                                    break;
                                }
                                if (i==kullanicilar.size()-1){
                                    System.out.println("Belirtilen TC No İle Kayıtlı Kullanıcı Bulunamadı!");
                                }
                            }
                        }
                        else if (secim2==2){
                            for (int i=0;i< gorevliler.size();i++){
                                if (gorevliler.get(i).getTcNo()==tc){
                                    System.out.println("Görevli Bulundu");
                                    System.out.println("Giriş Yapılıyor");
                                    index = i;
                                    gorevliIslemleri(index);
                                    break;
                                }
                                if(i==gorevliler.size()-1){
                                    System.out.println("Belirtilen TC No İle Kayıtlı Görevli Bulunamadı!");
                                }
                            }
                        }
                    }
                    if (secim2==0){
                        System.out.println("Geri Dönülüyor.");
                    }
                }while((secim2!=0));
            }
        if (secim==2){
            kullaniciKayit();
        }
        if (secim==3){
            belgeDogrula();
        }
        }while (secim!=0);

    }

}