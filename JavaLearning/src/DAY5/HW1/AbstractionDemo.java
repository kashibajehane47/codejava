package DAY5.HW1;

abstract class Shape {
    String color;

    abstract void draw();

    public void addColor(String color) {
        this.color = color;
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle with color: " + color);
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle with color: " + color);
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.addColor("Red");
        rectangle.draw();

        Shape circle = new Circle();
        circle.addColor("Blue");
        circle.draw();
    }
}
