import java.util.Scanner;

public class Running_Triangle {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km = 5000 meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter side 1 : ");
            double side1 = scanner.nextDouble();

            System.out.print("Enter side 2 : ");
            double side2 = scanner.nextDouble();

            System.out.print("Enter side 3 : ");
            double side3 = scanner.nextDouble();

            double rounds = calculateRounds(side1, side2, side3);

            
            System.out.println("Perimeter of the park = " + (side1 + side2 + side3) + " meters");
            System.out.println("The athlete must complete ≈ " + Math.ceil(rounds) + " rounds");
            
        }
    }
}

