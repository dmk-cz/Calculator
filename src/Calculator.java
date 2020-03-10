public class Calculator {

    void startCalculator() {
        InputBuffer inputConsole = new InputBuffer();
        String userStr = inputConsole.getUserInput();

        double a;
        double b;
        double result = 0;


        int len = userStr.length();

        boolean gotPlus = userStr.contains("+");
        boolean gotMinus = userStr.contains("-");
        boolean gotMultiply = userStr.contains("*");
        boolean gotDivision = userStr.contains("/");

        if(gotPlus == true) {
            int index = userStr.indexOf("+");
            //number 1
            String s = userStr.substring(0,index);
            a = Integer.parseInt(s);
            //number 2
            String s2 = userStr.substring(index+1, len);
            b = Integer.parseInt(s2);

            result = a + b;
        }

        if(gotMinus == true) {
            int index = userStr.indexOf("-");
            //number 1
            String s = userStr.substring(0,index);
            a = Integer.parseInt(s);
            //number 2
            String s2 = userStr.substring(index+1, len);
            b = Integer.parseInt(s2);

            result = a - b;
        }

        if(gotMultiply == true) {
            int index = userStr.indexOf("*");
            //number 1
            String s = userStr.substring(0,index);
            a = Integer.parseInt(s);
            //number 2
            String s2 = userStr.substring(index+1, len);
            b = Integer.parseInt(s2);

            result = a * b;
        }

        if(gotDivision == true) {
            int index = userStr.indexOf("/");
            //number 1
            String s = userStr.substring(0,index);
            a = Integer.parseInt(s);
            //number 2
            String s2 = userStr.substring(index+1, len);
            b = Integer.parseInt(s2);

            result = a / b;
        }



        System.out.println(result);

    }
}