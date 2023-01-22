package Abstract;

public class Main {
    public static void maşn(String[] args) {
        //Sekil sekil1=new Sekil("Sekil") bu hatalı tanımlamıdır objesi olusamaz
        Sekil sekil2 = new Sekil("Şekil 2") { //ama kendi sınıfından kodda yeni class olusabilr
            @Override
            void alan_hesapla() {
                System.out.println(5);
            }
        };
        Sekil kare1 = new Kare("Kare 1", 5);//alt sınıfını referans alabilir interfave benzer
        kare1.alan_hesapla();
        Sekil daire1=new Daire("Daire 1",2);//sekil polformizm mantığını kullanır
        daire1.alan_hesapla();
        Daire daire2=new Daire("Daire 2",4);//kendi objesini rahat bir şekilde oluşturabilir
        Kare kare2=new Kare("Kare 2",6);
        kare2.alan_hesapla();
        kare2.cevreHesapla();//Sekil sınıfında cevre hesapla metodu olmadığı için  sekilde oluşturduğumuzda çevre hesaplamayı algılamz.interface mantığına benzer
    }
}