package postfix;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter postfix operation (use space as delimiter):");
        Scanner sc = new Scanner(System.in);
        String postfix = sc.nextLine();
        String[] tokens = postfix.split(" ");
        Stack<Double> stack = new Stack<Double>();

        stackProcess(tokens);

        for (String s : tokens) {
            if (isOperator(s)) {
                double b = stack.pop();
                double a = stack.pop();

                try {
                    double result = operate(s, a, b);
                    stack.push(result);
                } catch (IllegalArgumentException iAE) {
                    System.out.println(iAE.getMessage());
                    System.exit(-1);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.exit(-1);
                }
            } else {
                try {
                    double num = Double.parseDouble(s);
                    stack.push(num);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.exit(-1);
                }
            }
        }

        System.out.println(postfix + " = " + stack.pop());
    }

    public static boolean isOperator(String s) {
        switch(s) {
            case "+":
                return true;
            case "-":
                return true;
            case "*":
                return true;
            case "/":
                return true;
            default:
                return false;
        }
    }

    public static double operate(String s, double a, double b) {
        switch(s) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Operrand not found");
        }
    }

    public static void stackProcess(String[] tokens) {
        for (String s : tokens) {
            System.out.println("Token: " + s);
            if (isOperator(s)) {
                System.out.println("Pop two numbers from stack");
                System.out.println("Push result to stack");
            } else {
                System.out.println("Push " + s + " to stack");
            }
        }
    }
}
