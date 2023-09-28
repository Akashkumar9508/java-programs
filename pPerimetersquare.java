import java.util.Scanner;
public class pPerimetersquare {
    public static void main(String[] args) {
        System.out.println("enter the side of Square:--");
        Scanner scanner=new Scanner(System.in);
        int side=scanner.nextInt();
        int perimeter=4*side;      
        System.out.println("the perimeter of square is :----"+perimeter);
        scanner.close();
    }
}
