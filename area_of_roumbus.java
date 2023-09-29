import java.util.Scanner;
public class area_of_roumbus {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("there is two method to find area of roumbus:-");
        System.out.println("first using digonal ");
        System.out.println("second base or height");
        System.out.println("enter 1 to continue with digonal and press 2 for height and base");
        int input=scanner.nextInt();
        if(input==1){
            System.out.println("enter the digonal 1 and 2 ");
            System.out.println("ente digonal1:---");
            int digonal1=scanner.nextInt();
            System.out.println("enter the digonal2:----");
            int digonal2=scanner.nextInt();
            double result=0.5*digonal1*digonal2;
            System.out.println("the area of roumbus is :---"+result);


        }
        else{
            System.out.println("enter the base :--");
            int base =scanner.nextInt();
            System.out.println("enter the height:----");
            int height=scanner.nextInt();
            int result2=base*height;
            System.out.println("the area of roumbus is:---"+result2);
        }
        scanner.close();
    }
}
