import java.util.Scanner;
public class Perimeterrectangle {
    public static void main(String[] args) {
        System.out.println("enter the length and breadth of rectangle :--");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the length :--");
        int length = scanner.nextInt();
        System.out.println("enter the breadth :--");
        int breadth=scanner.nextInt();
        int perimeter=2*(length+breadth);
        System.out.println("the perimeter of rectangle is :---" +perimeter);
        scanner.close();
    }
    
}
