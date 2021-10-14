package Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();
        point2D.setXY(3, 5);
        point3D.setXYZ(1,5,9);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
