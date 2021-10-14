package Point2;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }
    @Override
    public String toString() {
        return "MovablePoint{"
               + Arrays.toString(getXY())+" Speed :"+Arrays.toString(getSpeed())+
                '}';
    }
    public MovablePoint move(){
        setX(getX()+getXSpeed());
        setY(getY()+getYSpeed());
        return this;
    }
}
