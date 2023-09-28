import java.util.Scanner;
public class Areatriangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the base of a triangle:--");
        double base=scanner.nextDouble();
        System.out.println("Enter the height of a triangle:--");
        double height=scanner.nextDouble();
        double area = 0.5 * base * height ;
        System.out.println("The area of triangle is :---"+area);
        scanner.close();
        
        
    }
}
