package Beginners_level;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14;

        //Area of Circle
        System.out.println("Please enter radius of circle: ");
        double radius = scanner.nextDouble();
        double areaOfCircle = pi * (Math.pow(radius,2));
        System.out.println("The area of the circle is: " + areaOfCircle);
    }
}
class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Area of Rectangle
        System.out.println("Please enter the measurements for the rectangle:");
        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        double areaOfRectangle = length * width;
        System.out.println("The area if the rectangle is: " + areaOfRectangle);
    }
}

class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Area of triangle
        System.out.println("Please enter the base length and height of the triangle: ");
        System.out.println("Enter the base length: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();
        double areaOfTriangle = base * height / 2;
        System.out.println("The area of the triangle is: " + areaOfTriangle);
    }
}

class Mortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Mortgage Calculator
        final byte percent = 100;
        final byte months = 12;

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double interest = scanner.nextDouble();
        double rate = interest / months / percent;

        System.out.print("Period (Years): ");
        int years = scanner.nextInt();
        int period = years * months;

        double mortgage = principal * (rate * Math.pow(1 + rate,period)) / (Math.pow(1 + rate,period) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}