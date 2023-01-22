package Interface;

public class Main {
    public static void main(String[] args){
        User kisi=new User("Yasin",18,145);
        User.SignUpManger yask=new User.SignUpManger(new User.yasKontol());//aynı referanstan iki farkıl kotrol olusturduk
        User.SignUpManger idk=new User.SignUpManger(new User.IdKontrol());//User:sign yazma nedenim class içinde classa erşim
        yask.signup(kisi);//aynı metodu soyutlmak aynı metod ismincde hem yası hemıd konrol edebilirzi
        idk.signup(kisi);
    }
}
