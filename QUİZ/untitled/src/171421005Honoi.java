public class Honoi {

    //Muhammed Yasin Özdemir
    //171421005

    public static void main(String[] args) {
        int n = 5; 
        hanoi(n, "A", "B", "C");
    }

    public static void hanoi(int n, String kaynak, String auxiliary, String target) {
        if (n == 0) {
            return;
        }

        hanoi(n - 1, kaynak, target, auxiliary);


        System.out.println("Disk " + n + " " + kaynak + "'den " + target +"'ye taşındı");


        hanoi(n - 1, auxiliary, kaynak, target);
    }
}