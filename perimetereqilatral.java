import java.util.Scanner;
public class perimetereqilatral {
    public static void main(String[] args) {
        System.out.println("enter the side of  triangle:--");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the side :---");
        int side= scanner.nextInt();
        int perimeter=3*side;
        System.out.println("the perimeter of triangle:--"+perimeter);
        scanner.close();
    
    
    }
    }