public class Kod_blokları {
    int a=8;//global değişken her yerde gecerli
    public static void main(String[] args){
        int b=10;//yerel değişken

        if(b<20){
            int c;//blok değişkeni if ten cıktıktan sonra yok olur
        }
        for(int i=0;i<5;i++)//i yukarıda tanımlansaydı yok olmazdı ama blok içinde tanımlandığı için yok olur.
            System.out.print(i+"   ");
        topla();
    }
    public static void topla(){
        int a=4,b=5;//bu fonksiyon içindetanımlanan değişkenler bittiğnd eyok olur
        //globaldeaki anın yerine bunu yazar a değimez gloabalde ama basında int yoksa değişir
        System.out.println(a+b);
        System.out.println(a);
    }
}
