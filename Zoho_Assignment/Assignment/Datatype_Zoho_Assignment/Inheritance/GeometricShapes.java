class Shape {
    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public void display() {
        System.out.println("Shape: " + this.getClass().getSimpleName());
    }

    int length, breath;

    Shape(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    Shape(int length) {
        this.length = length;
    }
}

class Square extends Shape {
    Square(int l) {
        super(l);
    }

    @Override
    public double area() {
        return length * length;
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }
}

class Rectangle extends Shape {
    Rectangle(int l, int b) {
        super(l, b);
    }

    @Override
    public double area() {
        return length * breath;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breath);
    }
}

public class GeometricShapes {
    public static void main(String[] args) {
        Shape s = new Rectangle(4, 6);
        s = new Square(4);
        s.display();
        System.out.println("Area of rectangle: " + s.area());
        System.out.println("Perimeter of rectangle: " + s.perimeter());
        s.display();
        System.out.println("Area of square: " + s.area());
        System.out.println("Perimeter of square: " + s.perimeter());
    }
}
