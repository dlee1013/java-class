public class Square extends Shape{

    int x;
    
    Square(int x){
        this.x = x;
    }

    @Override
    double getArea() {
        return x * x;
    }

    @Override
    double gePerimeter() {
        return x + x;
    }
        
}
