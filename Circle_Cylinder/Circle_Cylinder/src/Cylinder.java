public class Cylinder extends Circle {
    private double height;
    private final double PI = 3.14;
    public Cylinder() {

    }

    public Cylinder(double radius,String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume(){
        return this.PI * getRadius() * getRadius() * this.height;
    }

}

