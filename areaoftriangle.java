import java.util.Scanner;
public class areaoftriangle {
    public static void main(String[] args) {
        System.out.println("the area of triangle is :- ");
        Scanner ak = new Scanner(System.in);
        System.out.printf("enter the base of triangle:- ");
        float base =ak.nextFloat();
        System.out.printf("enter the hieght of triangle:- ");
        float hieght =ak.nextFloat();
        float area = 0.5f*base*hieght;
        System.out.printf("the area of triangle is = %.2f",area);
        ak.close();
    }
    
}
