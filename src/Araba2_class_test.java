public class Araba2_class_test {
    public static void main(String[] args){
        Araba2 a1=null,a2=new Araba2();//a1 hiç bir yeri gostermiyor,a2 seklinde tanımlanır
        a2.setTekerlek(-1);//sart sağlanmadoğı için değiştirmez
        a2.setTekerlek(4);//guvenli bir şekilde erişiriz
        a2.setModel("Ford");
        a2.setMotor(200);
        a2.setRenk("Beyaz");
        System.out.println(a2.getModel());//Guvenli bir şekilde okuruz
        a2.bilgileri_goster();//Method yazdırırz
    }
}
