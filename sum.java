import java.util.Scanner;
public class sum {

    public static void main(String[] args) {
        System.out.println("enter the first number:-  ");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the second number:-  ");
        int b = sc .nextInt();
        int sum= a+b;
        System.out.printf("the sum of two number is %d ",sum);
        sc.close();
    }
}