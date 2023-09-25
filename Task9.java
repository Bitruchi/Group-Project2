package GroupTasks2;

public class Task9 {

    interface Shape {
        double calculateArea();
        double calculatePerimeter();
    }

    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * side;
        }
    }


        public static void main(String[] args) {
            Circle circle = new Circle(5.0);
            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

            Square square = new Square(4.0);
            System.out.println("Square Area: " + square.calculateArea());
            System.out.println("Square Perimeter: " + square.calculatePerimeter());
        }
    }


