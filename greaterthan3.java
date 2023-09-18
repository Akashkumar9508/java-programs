import java.util.Scanner;

public class greaterthan3 {
     public static void main(String[] arg) {
          System.out.println("enter the three number respectively:- ");
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          int max ;
          max = (a>b&&a>c)?a:(b>a&&b>c)?b:c;
          System.out.println("the greater one is = "+max);
          sc.close();

     }

}
