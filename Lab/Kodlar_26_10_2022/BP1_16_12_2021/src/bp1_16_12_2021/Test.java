package bp1_16_12_2021;


public class Test {
    public static void main(String[] args) {
        
        Circle c1= new Circle();
        //c1.radius=-5;
        c1.setRadius(15);
        System.out.println("Radius="+c1.getRadius());
        System.out.println("Circle toString:"+c1.toString());
        System.out.println("C1 Alan:"+c1.getArea());
    }
}
