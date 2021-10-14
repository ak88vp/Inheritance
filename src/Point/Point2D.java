package Point;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void  setXY(float X,float Y){
        this.x=X;
        this.y=Y;
    }
    public float[] getXY(){
        float[] arr=new float[2];
        arr[0]=this.x;
        arr[1]=this.y;
        return arr;
//return new float[]{this.x,this.y};
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +"x,y"+ Arrays.toString(this.getXY()) +
                '}';
    }
}
