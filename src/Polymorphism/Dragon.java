package Polymorphism;

public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizli_yetenek;
        public Dragon(String beybladci, double donus_hizi, double saldiri_gucu, String kutsalCanavar) {
            super(beybladci, donus_hizi, saldiri_gucu);
            this.kutsalCanavar = kutsalCanavar;
        }

        @Override
        public void kutsoalcanavarOrtaaycikar() {
            System.out.println(getBeybladci()+ " "+kutsalCanavar +" ı ortaya çıkarın");
            System.out.println(getBeybladci()+" saldırısı :Hayalet Kasırga");
        }

    public Dragon(String beybladci, double donus_hizi, double saldiri_gucu, String kutsalCanavar, String gizli_yetenek) {
        super(beybladci, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizli_yetenek = gizli_yetenek;
    }

    @Override
        public void bilgileri_goster() {
            super.bilgileri_goster();
            System.out.println("Kutsal canavar adı:"+kutsalCanavar);
            System.out.println("Gizli yetenek"+gizli_yetenek);

        }
    }


