import java.util.Scanner;

public class minicalculator {

  public static void main(String[] args) {
   
    // You can call the disp() method here if needed.
    minicalculator calculator = new minicalculator();
    calculator.disp();
    calculator.sum();
  }

  void sum(){
     char operator;
    float number1, number2, result;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter first number");
    number1 = input.nextFloat();

    System.out.println("Enter second number");
    number2 = input.nextFloat();

    switch (operator) {
      case '+':
        result = number1 + number2;
        System.out.printf("The sum is = %.2f", result);
        break;
      case '-':
        result = number1 - number2;
        System.out.printf("The subtraction is = %.2f", result);
        break;
      case '*':
        result = number1 * number2;
        System.out.printf("The multiplication is = %.2f", result);
        break;
      case '/':
        if (number2 == 0) {
          System.out.println("Division by zero is not allowed.");
        } else {
          result = number1 / number2;
          System.out.printf("The division is = %.2f", result);
        }
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }
    
  }
  void disp() {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your name:");
    String name = input.next();
    System.out.println("Hello, " + name + "!");
  }
}
