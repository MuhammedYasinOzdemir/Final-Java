package Polymorphism;

public class Drayga extends Beyblade {

        private String kutsalCanavar;

        public Drayga(String beybladci, double donus_hizi, double saldiri_gucu, String kutsalCanavar) {
            super(beybladci, donus_hizi, saldiri_gucu);
            this.kutsalCanavar = kutsalCanavar;
        }

        @Override
        public void kutsoalcanavarOrtaaycikar() {
            System.out.println(getBeybladci()+ " "+kutsalCanavar +" ı ortaya çıkarın");


        System.out.println(getBeybladci()+" saldırısı :Alev Kaplan pencesi");

    }

    @Override
        public void bilgileri_goster() {
            super.bilgileri_goster();
            System.out.println("Kutsal canavar adı:"+kutsalCanavar);
        }


}
