public class Degiskenler_Tamsayi {
    public static void main(String[] args){
        int a;// 32 bittir tam sayı tutar
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        short b;//16 bitlik yer kaplar
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        long c;//64 bitlik yer kaplar
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        byte d;//8 bitlik yer kaplıyor
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        //byte-->short-->int-->long
        byte e=100;
        byte f=(byte)(e/2);
        System.out.println(f);
    }
}
