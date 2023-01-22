public class Cokgen {


    Cokgen(){
        System.out.println("Kenar bilgisi girilmedi!");
    }
    Cokgen(int a, int b, int c){

        System.out.println("Şekil üçgendir");
        System.out.println("Cevre= "+(a+b+c));
    }
    Cokgen(int a, int b, int c, int d){
        if ((a==b)&&(a==c)&&(a==d)) {
            System.out.println("Şekil karedir");
            System.out.println("Cevre= " + (a + b + c + d));
        }
        else {
            System.out.println("Şekil dörtgendir");
            System.out.println("Cevre= " + (a + b + c + d));
        }
    }
}
