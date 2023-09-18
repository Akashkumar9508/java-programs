import java.util.Scanner;
public class minicalculator {
    public static void main (String [] arg){
       

    char operator;
    float number1, number2, result;


    Scanner input = new Scanner(System.in);

   
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    
    System.out.println("Enter first number");
    number1 = input.nextFloat();

    System.out.println("Enter second number");
    number2 = input.nextFloat();

    switch(operator) {

   
      case '+':
        result = number1 + number2;
        System.out.printf("the sum is = %.2f" ,result);
        break;

 
      case '-':
        result = number1 - number2;
        System.out.printf("the sub is = %.2f" ,result);
        break;

     
      case '*':
        result = number1 * number2;
        System.out.printf("the multiply is = %.2f" ,result);
        break;

   
      case '/':
        result = number1 / number2;
        System.out.printf("the divide is = %.2f" ,result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }

  
        
        }
    

    

