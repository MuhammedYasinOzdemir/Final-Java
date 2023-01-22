public class TestEv {
    public static void main(String[] args) {
        //Ev sınıfı soyut(abstract) sınıf olduğu için
        //Nesnesi oluşturulamaz !!!
        //Ev e1 = new Ev(10,5);
        Villa v1= new Villa(1,3,false);
        System.out.println("V1 Villası="+v1.toString());
        System.out.println("V1 villa fiyatı="+v1.fiyatHesapla());
        
        Daire d1 = new Daire(10,12,1000);
        System.out.println("D1 dairesi="+d1.toString());
        System.out.println("D1 Dairesinin Fİyatı="+d1.fiyatHesapla());
    }
}
