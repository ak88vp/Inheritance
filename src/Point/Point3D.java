package Point;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] arr1= {this.getX(), this.getY(), this.z};
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +" y= "+getY()+" z= "+getX()+
                '}';
    }
}
