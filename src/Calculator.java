public class Calculator {

    void startCalculator() {
        InputBuffer inputConsole = new InputBuffer();
        String userStr = inputConsole.getUserInput();

        int a;
        int b;
        int result = 0;

        // Numbers
        String s = userStr.substring(0,1);
        a = Integer.parseInt(s);

        String s2 = userStr.substring(2,3);
        b = Integer.parseInt(s2);

        // Operation
        String opr = userStr.substring(1,2);

        switch (opr) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "x":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Error..");
            }

        System.out.println(result);

    }
}