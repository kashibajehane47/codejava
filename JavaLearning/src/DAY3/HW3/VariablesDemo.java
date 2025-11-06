package DAY3.HW3;

class Shape {
    int length;
    int width;
    int radius;


    public double areaOfRectangle() {
        int area = length * width;
        return area;
    }


    public double areaOfCircle() {
        double pi = 3.1416;
        double area = pi * radius * radius;  // π * r^2
        return area;
    }
}

public class VariablesDemo {
    public static void main(String[] args) {

        Shape rectangle = new Shape();
        rectangle.length = 15;
        rectangle.width = 45;
        System.out.println("Area of Rectangle: " + rectangle.areaOfRectangle());

        Shape circle = new Shape();
        circle.radius = 5;
        System.out.println("Area of Circle: " + circle.areaOfCircle());
    }
}
