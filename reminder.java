import java.util.Scanner;

public class reminder {
    public static void main(String[] args) {
        System.out.printf("enter the bigger number:-  " );
        System.out.printf("enter the smaller number:-  ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int rem=a%b;
        System.out.printf("the reminder is %d",rem);
        sc.close();
    }
}
