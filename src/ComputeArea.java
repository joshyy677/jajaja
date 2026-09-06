import java.util.Scanner;
public class ComputeArea {
    public static void main(String[] args) {
        double radius, length, width, side, base, height, circle, rectangle, square, triangle;
        Scanner input = new Scanner(System.in);

        System.out.println("Area of Circle");
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        System.out.println("Area of Rectangle");
        System.out.print("Enter length: ");
        length = input.nextDouble();
        System.out.print("Enter width: ");
        width = input.nextDouble();
        System.out.println("Area of Square");
        System.out.print("Enter side: ");
        side = input.nextDouble();
        System.out.println("Area of triangle");
        System.out.print("Enter base: ");
        base = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();

        circle = 3.14159265 * radius * radius;
        rectangle = length * width;
        square = side * side;
        triangle = base * height * 0.5;

        System.out.println("\nThe area of the circle is : " + circle);
        System.out.println("The area of the rectangle is : " + rectangle);
        System.out.println("The area of the square is : " + square);
        System.out.println("The area of the triangle is : " + triangle);

    }
}