package org.promathtelegrambot.operations.geometry;

abstract class Figure{
    double height;
    double width;
    double radius;
    double angle;
    abstract double area(double height, double width, double radius, double angle);
    abstract double perimeter(double height, double width, double radius, double angle);
}

class Circle extends Figure{
    @Override
    double area(double height, double width, double radius, double angle) {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter(double height, double width, double radius, double angle) {
        return 2 * Math.PI * radius;
    }
}

class Square extends Figure{
    @Override
    double area(double height, double width, double radius, double angle) {
        return Math.pow(width, 2);
    }

    @Override
    double perimeter(double height, double width, double radius, double angle) {
        return 4*width;
    }
}

class Rectangle extends Square{
    @Override
    double area(double height, double width, double radius, double angle) {
        return width * height;
    }

    @Override
    double perimeter(double height, double width, double radius, double angle) {
        return 2 * width * height;
    }
}

class Triangle extends Figure{
    @Override
    double area(double height, double width, double radius, double angle) {
        return width * height * 1/2;
    }

    @Override
    double perimeter(double height, double width, double radius, double angle) {
        return (width * 2) * height;
    }
}

class TriangleWithAngle extends Triangle{
    @Override
    double area(double height, double width, double radius, double angle) {
        return width * height * 1/2 * Math.sin(Math.toRadians(angle));
    }
}

public class GeometryOperations {
    Figure triangle;
    Figure triangleWithAngle;
    Figure circle;
    Figure square;
    Figure rectangle;
    public void setValues(double height, double width, double radius, double angle){
        circle = new Circle();
        triangle = new Triangle();
        triangleWithAngle = new TriangleWithAngle();
        square = new Square();
        rectangle = new Rectangle();
        /////////////////////////////////////////////////////////////////////////////
        System.out.println(circle.area(height, width, radius, angle));
        System.out.println(triangle.area(height, width, radius, angle));
        System.out.println(triangleWithAngle.area(height, width, radius, angle));
        System.out.println(square.area(height, width, radius, angle));
        System.out.println(rectangle.area(height, width, radius, angle));
        /////////////////////////////////////////////////////////////////////////////
        System.out.println(circle.perimeter(height, width, radius, angle));
        System.out.println(triangle.perimeter(height, width, radius, angle));
        System.out.println(triangleWithAngle.perimeter(height, width, radius, angle));
        System.out.println(square.perimeter(height, width, radius, angle));
        System.out.println(rectangle.perimeter(height, width, radius, angle));
    }
}
