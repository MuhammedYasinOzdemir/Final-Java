public class Method_asal_bul {
    public static void main(String[] args){
       for(int i=2;i<1000;i++)
       {
           if(asal_bul(i))
               System.out.println(i);
       }
    }
    public static boolean asal_bul(int a){
        int c;
        for(int i=2;i<(a/2)+1;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
}
