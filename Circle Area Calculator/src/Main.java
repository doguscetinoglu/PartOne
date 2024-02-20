import java.util.Scanner;

/**
 * A program to calculate the area of a circle and the area of a sector.
 * Author: Doğuş Çetinoğlu, Xls
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius, angle, area, pi, circumference, sectorArea;
        pi = 3.14;

        // Getting input from the user for radius and central angle measurement
        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();
        System.out.println("Enter the central angle measurement: ");
        angle = scanner.nextDouble();

        // Calculating area and circumference based on the input values
        area = pi * radius * radius;
        circumference = 2 * pi * radius;
        sectorArea = (pi * (radius * radius) * angle) / 360;

        // Displaying the results
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);
        System.out.println("Area of the sector: " + sectorArea);
    }
}
