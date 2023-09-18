import java.util.Scanner;
public class multiply {
    public static void main(String[] args) {
        System.out.printf("enter the first number:-  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("enter the second number:- ");
        int b= sc.nextInt();
        int mul=a*b;
        System.out.printf("the product of the given number is :-  ");
        System.out.printf("%d",mul);
        sc.close();




    }
}
