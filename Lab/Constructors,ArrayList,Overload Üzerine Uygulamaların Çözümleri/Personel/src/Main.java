public class Main {
    public static void main(String[] args) {

      Personel personel1 = new Personel();
      Personel personel2 = new Personel("Büşra","Büyüktanır",10,100);

      personel1.setAd("Tolga");
      personel1.setSoyad("Büyüktanır");
      personel1.setCalismaYili(10);
      personel1.setMaas(100);


      System.out.println("Perosnel ismi: " + personel1.getAd() +" Perosnel soyismi: " + personel1.getSoyad() + " Perosnel calışma yılı: " + personel1.getCalismaYili() + " Perosnel maaşı: " + personel1.getMaas());
      System.out.println("Perosnel ismi: " + personel2.getAd() +" Perosnel soyismi: " + personel2.getSoyad() + " Perosnel calışma yılı: " + personel2.getCalismaYili() + " Perosnel maaşı: " + personel2.getMaas());

    }

}