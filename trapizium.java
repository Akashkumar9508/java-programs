import java.util.Scanner;
public class trapizium {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("there is two method to find area or  perimeter of trapizium:-");
    System.out.println("first using area ");
    System.out.println("second perimeter");
    System.out.println("enter 1 to continue with area and press 2 for perimeter");
    int input=scanner.nextInt();
    if(input==1){
        System.out.println("enter the smaller top side and height or bigger lower side :--- ");
        System.out.println("enter the smaller top side:---");
        double stside=scanner.nextDouble();
        System.out.println("enter the height:----");
        double height=scanner.nextDouble();       
         System.out.println("enter the bigger lower side:----");
        double bbside=scanner.nextDouble();
        double result=0.5*(stside+bbside)*height;
        System.out.println("the area of trapizium is :---"+result);


    }
    else{
        System.out.println("enter the four side of trapizium respectively");
        double s1 =scanner.nextDouble();
        double s2 =scanner.nextDouble();
        double s3 =scanner.nextDouble();
        double s4 =scanner.nextDouble();
        double result2=s1+s2+s3+s4;
        System.out.println("the perimeter of trapizium is:---"+result2);

    }
    scanner.close();

}
    
}
