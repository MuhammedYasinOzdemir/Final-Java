package bp1_16_12_2021;
public class Circle extends GeometricObject {
  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    if(radius>=0){
        this.radius = radius;
    }
    else{
        System.out.println("0 dan büyük sayi girin");
        this.radius=1.0;
    }
      
  }

  //@Override /** Return area */
  /*public double getArea() {
    return radius * radius * Math.PI;
  }*/

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }

  //@Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /* Print the circle info */
  public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
      " and the radius is " + radius);
  }

    @Override
    public String toString() {
        return "Circle Sınıfının toString Metodu";
    }
    
    public double getArea() {
    return radius*radius*Math.PI;
  }
  
}
