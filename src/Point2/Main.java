package Point2;

public class Main {
    public static void main(String[] args) {
        Point point=new Point(3,24);
        System.out.println(point);
        MovablePoint movablePoint=new MovablePoint(2,3,4,5);
        movablePoint.move();
        System.out.println(movablePoint);


    }
}
