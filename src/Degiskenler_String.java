public class Degiskenler_String {
    public static void main(String[] args){
//Strinler ilkel değildir metodları vardır
        String a="Yasin";
        System.out.println(a+" Hoşgeldiniz...");
        String b="Ozdemir";
        String toplam=a+b;
        System.out.println(toplam);
        int x=25;
        String c=a+x;//x stinge cevrilir
        System.out.println(c);
        a=c;
        System.out.println(a);//a nın degeri değişir
        char f='!';
        a+=f;
        System.out.println(a);//char karekter sona eklendi..
        String z="Java"+
                "Programlama"+
                "Dili";//boyle alt alta tanımlanabilir
        System.out.println(z);
        String ssd=new String();
        Integer asa=4;
        ssd=asa.toString();
        System.out.println(ssd);
    }
}
