package Vjezba1911.ENKAPSULACIJA;

public class Shape {
    private Color color;
    public Shape(Color color){
        this.color = color;
    }
    public Color getColor(Color color){
        return color;
    }

    public void setColor(Color newColor){
        this.color = newColor;
    }
    public double getArea(){
        return 0.0;
    }
    public void displayDetails(){
        System.out.println("AREA: " + getArea());
        System.out.println("COLOR " + color);
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    private double len;
    private double wid;
    public Rectangle(Color color, double len, double wid){
        super(color);
        this.len = len;
        this.wid = wid;
    }

    @Override
    public double getArea(){
        return len*wid;
    }
}
class Main{
    public static void main(String[] args) {
        Circle firstCircle = new Circle(Color.BLACK, 5.0);
        Rectangle firstRectangle = new Rectangle(Color.WHITE, 4.0, 6.0);

        System.out.println("Circle details: ");
        firstCircle.displayDetails();
        System.out.println("*****************");
        System.out.println("Rectangle details");
        firstRectangle.displayDetails();
    }
}