package Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                " Area : "+getArea()+" Perimeter : "+getPerimeter()+
                '}';
    }

}
class Test{
    public static void main(String[] args) {
        Circle circle=new Circle(3,"Color");
        System.out.println(circle);
        Cylinder cylinder=new Cylinder(5,"red",10);
        System.out.println(cylinder);

    }
}
