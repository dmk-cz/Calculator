public class CalculatorLauncher {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("CALCULATOR v 1.2");
        System.out.println("*****************");
        System.out.println("Program calculator. Enter numbers from 0 to 9 inclusive");
        System.out.println("Enter user inputs using following format:");
        System.out.println("3+2");
        System.out.println("2/4");
        System.out.println("3*6");
        System.out.println("1-1");
        System.out.println("Enter a string without spaces. Then press enter");
        System.out.println("---------------------");
        Calculator calculator = new Calculator();
        calculator.startCalculator();
    }
}
