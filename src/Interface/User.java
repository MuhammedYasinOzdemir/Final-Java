package Interface;

public class User {
    static class yasKontol implements IKontrol{
        @Override
        public boolean konrol(User user) {
            if(user.getYas()>18)
                return true;
            else
                return false;
        }
    }
   static class IdKontrol implements IKontrol{//kontrol methodu birden fazla metodun imzası olabilr
        @Override
        public boolean konrol(User user) {
            if(user.getId()<1000)
                return true;
            else
                return false;
        }

    }
    static class SignUpManger{
        private IKontrol kontrol;

        public SignUpManger(IKontrol kontrol) {//içine girilene gore referans alır yanı sooyut sınıf gibi davranır yaş kontrol gönderirse yası id kontrol gonderirse if yi kontrol eder
            this.kontrol = kontrol;
        }

        public void signup(User user){
            if(kontrol.konrol(user)){
                System.out.println("Kullanıcı kayıt oldu");
            }
            else {
                System.out.println("Kullanıcı kayıt olamadı...");
            }

        }
    }
    private String isim;
    private int yas;
    private int id;


    public User(String isim, int yas, int id) {
        this.isim = isim;
        this.yas = yas;
        this.id = id;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
