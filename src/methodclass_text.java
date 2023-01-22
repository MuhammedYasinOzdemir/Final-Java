public class methodclass_text {
    public static void main(String[] args){
        methodclass a=new methodclass();
        a.setModel("Mmsm");
        System.out.println(a.getModel());
        a.setTekerlek(8);
        a.setTekerlek(5);
        System.out.println(a.getTekerlek());
        methodclass b=null;//herhangi obje gostermiyor
        b=new methodclass();//şimdi gosteriyot
    }
}
