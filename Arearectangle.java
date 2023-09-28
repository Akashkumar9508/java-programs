import java.util.Scanner;
public class Arearectangle {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the length and Breadth of rectangle:--");
    System.out.println("length=");
    int length=scanner.nextInt();
    System.out.println("breadth:--");
    int breadth=scanner.nextInt();
    int area=length * breadth;
    System.out.println("the area of rectangle is :---- "+area);
    scanner.close();


}
}
