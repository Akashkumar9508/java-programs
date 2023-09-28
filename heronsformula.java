import java.util.Scanner;
public class heronsformula {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //enter the three side of triangle//
        System.out.println("enter the first side of triangle:-");
        double a=scanner.nextDouble();
        System.out.println("enter the second side of triangle:-");
        double b=scanner.nextDouble();
        System.out.println("enter the third side of triangle:-");
        double c=scanner.nextDouble();
        //to find the value of s//
        double s=a+b+c/2.0;
        //area of triangle using herons//
        double area = Math.sqrt(s*(s-a) *(s-b) *(s-c));
        System.out.println("the area of triangle using herons formula is :---- "+area);
        scanner.close();
    }
}
