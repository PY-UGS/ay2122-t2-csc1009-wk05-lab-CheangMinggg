

public class Square extends Shape {

    public Square(double height, double width) {
        super();
        setHeight(height);
        setWidth(width);
    }
    
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return getHeight() * getWidth();
    }
    
}
