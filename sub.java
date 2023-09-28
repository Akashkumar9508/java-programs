import java.util.Scanner;
public class sub {
    public static void main (String[ ]args){
        System.out.println("enter the two number:----");
        Scanner scanner=new Scanner(System.in);
        System.out.println("first number:--");
        int number1=scanner.nextInt();
        System.out.println("second number:---");
        int number2=scanner.nextInt();
        int result=number1-number2;
        System.out.println("the sub is = "+result);
        scanner.close();



    }
    
}
