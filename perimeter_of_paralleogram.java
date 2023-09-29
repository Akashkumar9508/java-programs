import java.util.Scanner;
public class perimeter_of_paralleogram {
    public static void main(String[] args) {
        System.out.println("enter the side and base of parallogram:---");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the side:---");
        int side=scanner.nextInt();
        System.out.println("enter the base:---");
        int base=scanner.nextInt();
        int perimeter=2*(side*base);
        System.out.println("the perimeter of parallogram is :---"+perimeter);
        scanner.close();

    }
}
