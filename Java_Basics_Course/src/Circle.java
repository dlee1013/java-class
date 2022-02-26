
public class Circle extends Shape{

    double radius;

    Circle(int radius){
        this.radius = radius;
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double gePerimeter() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * radius;
    }
    
}
