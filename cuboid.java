import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Volume");
        System.out.println("Enter 2 for Curved surface area");
        System.out.println("Enter 3 for total surface area:");
        int user_input = scanner.nextInt();

        if (user_input == 1) {
            System.out.println("Enter the length:");
            double length = scanner.nextDouble();
            System.out.println("Enter the width:");
            double width = scanner.nextDouble();
            System.out.println("Enter the height:");
            double height = scanner.nextDouble();
            double result = length * width * height;
            System.out.println("The volume of cuboid is: " + result);
        } else if (user_input == 2) {
            System.out.println("Enter the length:");
            double l1 = scanner.nextDouble();
            System.out.println("Enter the width:");
            double w1 = scanner.nextDouble();
            System.out.println("Enter the height:");
            double h1 = scanner.nextDouble();
            double rus1 = 2 * h1 * (l1 + w1);
            System.out.println("The curved surface area of cuboid is: " + rus1);
        } else if (user_input == 3) {
            System.out.println("Enter the length:");
            double l2 = scanner.nextDouble();
            System.out.println("Enter the width:");
            double w2 = scanner.nextDouble();
            System.out.println("Enter the height:");
            double h2 = scanner.nextDouble();
            double tsa = 2 * (l2 * w2 + w2 * h2 + h2 * l2);
            System.out.println("The total surface area of cuboid is: " + tsa);
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }

        scanner.close();
    }
}
