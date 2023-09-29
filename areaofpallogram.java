import java.util.Scanner;
public class areaofpallogram {
    public static void main(String[] args) {
        System.out.println("enter the base and the height of the parallelogram:--");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the height:---");
        int height=scanner.nextInt();
        System.out.println("enter the base :--");
        int base=scanner.nextInt();
        int area=height*base;
        System.out.println("the area of parallelogram is :--"+area);
        scanner.close();
    }
}
