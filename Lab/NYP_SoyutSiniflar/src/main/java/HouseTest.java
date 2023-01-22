public class HouseTest {
    public static void main(String[] args) {
        House h1 = new House(1,158.2);
        House h2 = new House(2,156.2);
        
        House h3=(House)h1.clone();
        System.out.println("H3 Area="+h3.getArea());
        
        
        if(h1.compareTo(h2)>0){
            System.out.println("H1 Büyük "+h1.getArea());
        }
        else
            System.out.println("H2 Büyük "+h2.getArea());
    }
}
