import java.util.Scanner;
public class Areasquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the side of square:--");
        int side=scanner.nextInt();
        int area= side * side;
        System.out.println("the area of the square is:--"+area);
        scanner.close();
    }
    
}
