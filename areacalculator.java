public class areacalculator {


    public static double area(double radius) {
        return Math.PI * radius * radius;
    }


    public static double area(double length, double width) {
        return length * width;
    }

    public static double area(int side) {
        return side * side;
    }


    public static void main(String[] args) {
        // Circle
        double circleArea = area(5.0);
        System.out.println("Area of Circle (radius 5.0): " + circleArea);

        // Rectangle
        double rectangleArea = area(4.5, 3.0);
        System.out.println("Area of Rectangle (length 4.5, width 3.0): " + rectangleArea);

        // Square
        double squareArea = area(4);  // Calls the int version
        System.out.println("Area of Square (side 4): " + squareArea);
    }
}

