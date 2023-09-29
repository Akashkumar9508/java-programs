import java.util.Scanner;
public class semicircle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("there is two method to find area or  perimeter of semi circle:-");
        System.out.println("first using area ");
        System.out.println("second perimeter");
        System.out.println("enter 1 to continue with area and press 2 for perimeter");
        int input=scanner.nextInt();
        if(input==1){
            System.out.println("enter the radius of semicircle :--- ");
            double radius=scanner.nextDouble();
            double result=0.5*(Math.PI*radius*radius);
            System.out.println("the area of semi circle is :---"+result);
        }
        else{
            System.out.println("enter the radius of semi circle:--");
            double radius2=scanner.nextDouble();
            double result2=(Math.PI*radius2)+(radius2+radius2);
            System.out.println("the perimeter of semi circle is:---"+result2);
    
        }
        scanner.close();
    
    }
}
