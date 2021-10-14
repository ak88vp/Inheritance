package Triangle;

import Geometry.Shape;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private boolean check=true;

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public Triangle() {
        this.side1=1.0;
        this.side2=1.0;
        this.side3=1.0;
   }

    public Triangle(double side1, double side2, double side3) {
        if (side1==0||side3==0||side2==0){
            check=false;
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        if (check){
            double p=getPerimeter()/2;
            return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        }
        return -1;

    }
    public double getPerimeter(){
        if (check){
            return side1+side3+side2;
        }return -1;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                (isCheck()?" là 1 tam giác":" không phải là tam giác ban ơi .")+
                " Area = "+getArea()+" Perimeter = "+getPerimeter()+" A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? " filled " : " not filled ")+

                '}';
    }
}
class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            double a=scanner.nextDouble();
            double b=scanner.nextDouble();
            double c=scanner.nextDouble();
      if ( a==0||b==0||c==0){
          System.out.println("ko phải tam giác");
      } else {
          Triangle triangle=new Triangle(a,b,c);
          triangle.setFilled(false);
          System.out.println(triangle);
      }


    }
}
