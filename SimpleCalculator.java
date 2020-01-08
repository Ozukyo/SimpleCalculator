import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main (String []args) {
    
        int firstNumber = inputInteger("Enter first number: ");
        
        String operation = inputString("Enter an operation: ");
        
        int secondNumber= inputInteger("Enter second number: ");
        
        if (operation.equals("+")) {
            int result = addition(firstNumber, secondNumber);
            System.out.println(result);
        }else if (operation.equals("-")) {
            int result = substracion(firstNumber, secondNumber);
            System.out.println(result);
        }else if (operation.equals("*")) {
            int result = multiplication(firstNumber, secondNumber);
            System.out.println(result);
        } else if(operation.equals("/")) {
            int result = division(firstNumber, secondNumber);
            System.out.println(result);
        }

    }

    public static int inputInteger(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static String inputString(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        return operation;
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int substracion(int x, int y) {
        return x - y;
    }


    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    } 


}