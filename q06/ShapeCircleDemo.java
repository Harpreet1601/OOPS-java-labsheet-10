import java.util.ArrayList;

class Shape {
    double area() { return 0; }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) { this.radius = radius; }

    @Override
    double area() { return Math.PI * radius * radius; }

    void displayArea() {
        System.out.printf("Circle radius %.1f -> Area = %.2f%n", radius, area());
    }
}

public class ShapeCircleDemo {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2));
        circles.add(new Circle(3.5));
        circles.add(new Circle(5));

        for (Circle c : circles) c.displayArea();
    }
}
