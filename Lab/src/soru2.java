public class soru2
{
    public static void main(String[] args){
        String[] s={"1","2","a","3g","5g","6","6.0"};
        for(int i=0;i< s.length;i++){
            System.out.print(s[i]+": ");
            try {
                int a = Integer.parseInt(s[i]);
                System.out.println("Tam sayı");
            }
            catch (NumberFormatException ex){
                System.out.println("Tam sayı değil");
                System.out.println("Hata kodu:"+ex.toString());
            }
            finally {
                System.out.println();
            }
        }
    }
}
