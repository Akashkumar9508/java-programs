import java.util.Scanner;
public class perimetertriangle {
public static void main(String[] args) {
    System.out.println("enter the two side of triangle and base of triangle:--");
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the side 1:---");
    int s1= scanner.nextInt();
    System.out.println("enter the base :---");
    int base=scanner.nextInt();
    System.out.println("enter the second side :---");
    int s2=scanner.nextInt();
    int perimeter=s1+base+s2;
    System.out.println("the perimeter of triangle:--"+perimeter);
    scanner.close();


}
}
