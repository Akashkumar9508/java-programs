import java.util.Scanner;
public class isosclesarea {
    public static void main(String[] args) {
        System.out.println("enter the height and base of triangle:--");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the side :---");
        int height=scanner.nextInt();
        System.out.println("enter the base of triangle:--");
        int base =scanner.nextInt();
        double area=0.5* base*height;
        System.out.println("the area of triangle is:---"+area);
        scanner.close();

    }
}
