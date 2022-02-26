public class Rectangle extends Shape{

    int length;
    int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return length * width;
    }

    @Override
    double gePerimeter() {
        // TODO Auto-generated method stub
        return 2 * (length + width);
    }
    
}
