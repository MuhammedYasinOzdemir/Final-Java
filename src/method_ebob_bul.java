public class method_ebob_bul {
    public static int ebob_bul(int s1,int s2){
        int ebob=1;
        for(int i=1;i<=s1 &&i<=s2;i++){
            if (s1%i==0 && s2%i==0)
                ebob=i;
        }
        return ebob;
    }
    public static void main(String [] args){
        for (int i=1;i<20;i++){
            for(int j=1;j<10;j++){
                System.out.println(i+" , "+j+" : "+ebob_bul(i,j));
            }
        }
    }
}
