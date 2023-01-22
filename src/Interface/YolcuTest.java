package Interface;

public class YolcuTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\t\t\t İstanbul Havalimanına Hoşgeldiniz\n");
        String message = "\nYurt Dışı Çıkış Kuralları\n" + "Herhangi siyasi yasak olmamalı...\n"
                + "15 TL harç bedeli tam olarak yaturmanız gerekmektedir..." + "Gideceğiniz Ülkeye vizeniz olamalı";
        while (true) {
            System.out.println(message);
            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor");
            Thread.sleep(2000);
            if (!yolcu.harc()) {
                continue;
            }
            System.out.println("Siyasi Yasak Kontrol ediliyor...");
            Thread.sleep(2000);
            if (!yolcu.siyasiYasak()) {
                continue;
            }
            System.out.println("Vizeniz kontrol ediliyor");
            Thread.sleep(2000);
            if(!yolcu.vizeDurum()){
                continue;
            }
            System.out.println("İşlemleriniz Tamam yurt dışına çıkabilirsiniz...");
            break;

        }
    }
}
