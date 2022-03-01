

public class Ellipse extends Shape {

    public Ellipse(double shortRadius, double longRadius) {
        super();
        setLongRadius(longRadius);
        setShortRadius(shortRadius);
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return getLongRadius() * getShortRadius() * Math.PI;
    }
    
    
}
