import java.util.Scanner;
public class areaofeqilateral {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the side of a eqilatral triangle:-");
        double side=scanner.nextDouble();
        double area=(Math.sqrt(3)/4)*side*side;
        System.out.println("the area of triangle is :---"+area);
        scanner.close();
    }
}
