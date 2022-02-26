public class Triangle extends Shape {

    int a, b, c;

    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return (a + b + c)/2;
    }

    @Override
    double gePerimeter() {
        // TODO Auto-generated method stub
        return a + b + c;
    }
    
}
