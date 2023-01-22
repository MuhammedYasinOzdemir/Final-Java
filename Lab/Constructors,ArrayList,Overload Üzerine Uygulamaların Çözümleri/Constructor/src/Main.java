public class Main {
    public static void main(String[] args) {

        Telefon telefon1 = new Telefon("General Mobile","Go",1,8,8);
        Telefon telefon2 = new Telefon("LG","K10 Lite",2,16,8);
        Telefon telefon3 = new Telefon();
        telefon1.goster();
        telefon2.goster();
        telefon3.goster();
    }
}