public class Metodlar_2_return {
     static int a;
    public static void main(String[] args){
        System.out.println("Çıktı:"+toplama(4,8));
        System.out.println(iki_topla(kare_al(dort_carp(iki_carp(5)))));//boyle iç içe kullanabilir
        a=5;
    }
    public static int toplama(int a,int b){
        return a+b;

    }
    public static int iki_carp(int a)
    {
        return 2*a;
    }
    public static int dort_carp(int a)
    {
        return 4*a;
    }
    public static int kare_al(int a)
    {
        return a*a;
    }
    public static int iki_topla(int a)
    {
        return 2+a;
    }
}
