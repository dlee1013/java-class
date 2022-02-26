public class ShapeMain {
    public static void main(String[] args) {
        Square square = new Square(4);
        System.out.println("Square area: " + square.getArea()); 
        System.out.println("Square perimeter: " + square.gePerimeter() + "\n"); 

        Rectangle rectangle = new Rectangle(4,3);
        System.out.println("Rectangle area: " + rectangle.getArea()); 
        System.out.println("Rectangle perimeter: " + rectangle.gePerimeter() + "\n"); 

        Triangle triangle = new Triangle(4,3,2);
        System.out.println("Triangle area: " + triangle.getArea()); 
        System.out.println("Tirangle perimeter: " + triangle.gePerimeter() + "\n"); 

        Circle circle = new Circle(4);
        System.out.println("Circle area: " + circle.getArea()); 
        System.out.println("Circle perimeter: " + circle.gePerimeter() + "\n"); 
    }
}
