
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int operand1, operand2 = 2;
        System.out.println("Please enter operand1:");
        Scanner input = new Scanner(System.in);
        operand1 = input.nextInt();
        System.out.println("Please enter operand2:");
        operand2 = input.nextInt();

        System.out.println("Please enter an action:");
        Scanner action = new Scanner(System.in);
        String sign;
        sign = action.nextLine();
        switch(sign){
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "/":
                System.out.println(operand1 / operand2);
                break;
            case "%":
                System.out.println(operand2 % operand2);
                break;
            case " ":
                System.out.println("Please enter the action");
                break;
            default:
                System.out.println("Your action isn`t exist!");
        }

    }
}
