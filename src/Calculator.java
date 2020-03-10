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


        if (gotPlus == true) {
            int index = userStr.indexOf("+");
            //number 1
            String s = userStr.substring(0, index);

            switch (s) {
                case("I"):
                    a = 1;
                    break;
                case ("II"):
                    a = 2;
                    break;
                case ("III"):
                    a = 3;
                    break;
                case ("IV"):
                    a = 4;
                    break;
                case ("V"):
                    a = 5;
                    break;
                case ("VI"):
                    a = 6;
                    break;
                case ("VII"):
                    a = 7;
                    break;
                case ("VIII"):
                    a = 8;
                    break;
                case ("IX"):
                    a = 9;
                    break;
                case ("X"):
                    a = 10;
                    break;
                default:
                    a = Integer.parseInt(s);
            }

            //number 2
            String s2 = userStr.substring(index + 1, len);

            switch (s2) {
                case("I"):
                    b = 1;
                    break;
                case ("II"):
                    b = 2;
                    break;
                case ("III"):
                    b = 3;
                    break;
                case ("IV"):
                    b = 4;
                    break;
                case ("V"):
                    b = 5;
                    break;
                case ("VI"):
                    b = 6;
                    break;
                case ("VII"):
                    b = 7;
                    break;
                case ("VIII"):
                    b = 8;
                    break;
                case ("IX"):
                    b = 9;
                    break;
                case ("X"):
                    b = 10;
                    break;
                default:
                    b = Integer.parseInt(s2);
            }
            //b = Integer.parseInt(s2);

            result = a + b;
        }

        if (gotMinus == true) {
            int index = userStr.indexOf("-");
            //number 1
            String s = userStr.substring(0, index);

            switch (s) {
                case("I"):
                    a = 1;
                    break;
                case ("II"):
                    a = 2;
                    break;
                case ("III"):
                    a = 3;
                    break;
                case ("IV"):
                    a = 4;
                    break;
                case ("V"):
                    a = 5;
                    break;
                case ("VI"):
                    a = 6;
                    break;
                case ("VII"):
                    a = 7;
                    break;
                case ("VIII"):
                    a = 8;
                    break;
                case ("IX"):
                    a = 9;
                    break;
                case ("X"):
                    a = 10;
                    break;
                default:
                    a = Integer.parseInt(s);
            }
            //number 2
            String s2 = userStr.substring(index + 1, len);

            switch (s2) {
                case("I"):
                    b = 1;
                    break;
                case ("II"):
                    b = 2;
                    break;
                case ("III"):
                    b = 3;
                    break;
                case ("IV"):
                    b = 4;
                    break;
                case ("V"):
                    b = 5;
                    break;
                case ("VI"):
                    b = 6;
                    break;
                case ("VII"):
                    b = 7;
                    break;
                case ("VIII"):
                    b = 8;
                    break;
                case ("IX"):
                    b = 9;
                    break;
                case ("X"):
                    b = 10;
                    break;
                default:
                    b = Integer.parseInt(s2);
            }

            result = a - b;
        }

        if (gotMultiply == true) {
            int index = userStr.indexOf("*");
            //number 1
            String s = userStr.substring(0, index);

            switch (s) {
                case("I"):
                    a = 1;
                    break;
                case ("II"):
                    a = 2;
                    break;
                case ("III"):
                    a = 3;
                    break;
                case ("IV"):
                    a = 4;
                    break;
                case ("V"):
                    a = 5;
                    break;
                case ("VI"):
                    a = 6;
                    break;
                case ("VII"):
                    a = 7;
                    break;
                case ("VIII"):
                    a = 8;
                    break;
                case ("IX"):
                    a = 9;
                    break;
                case ("X"):
                    a = 10;
                    break;
                default:
                    a = Integer.parseInt(s);
            }

            //number 2
            String s2 = userStr.substring(index + 1, len);

            switch (s2) {
                case("I"):
                    b = 1;
                    break;
                case ("II"):
                    b = 2;
                    break;
                case ("III"):
                    b = 3;
                    break;
                case ("IV"):
                    b = 4;
                    break;
                case ("V"):
                    b = 5;
                    break;
                case ("VI"):
                    b = 6;
                    break;
                case ("VII"):
                    b = 7;
                    break;
                case ("VIII"):
                    b = 8;
                    break;
                case ("IX"):
                    b = 9;
                    break;
                case ("X"):
                    b = 10;
                    break;
                default:
                    b = Integer.parseInt(s2);
            }

            result = a * b;
        }

        if (gotDivision == true) {
            int index = userStr.indexOf("/");
            //number 1
            String s = userStr.substring(0, index);

            switch (s) {
                case("I"):
                    a = 1;
                    break;
                case ("II"):
                    a = 2;
                    break;
                case ("III"):
                    a = 3;
                    break;
                case ("IV"):
                    a = 4;
                    break;
                case ("V"):
                    a = 5;
                    break;
                case ("VI"):
                    a = 6;
                    break;
                case ("VII"):
                    a = 7;
                    break;
                case ("VIII"):
                    a = 8;
                    break;
                case ("IX"):
                    a = 9;
                    break;
                case ("X"):
                    a = 10;
                    break;
                default:
                    a = Integer.parseInt(s);
            }

            //number 2
            String s2 = userStr.substring(index + 1, len);

            switch (s2) {
                case("I"):
                    b = 1;
                    break;
                case ("II"):
                    b = 2;
                    break;
                case ("III"):
                    b = 3;
                    break;
                case ("IV"):
                    b = 4;
                    break;
                case ("V"):
                    b = 5;
                    break;
                case ("VI"):
                    b = 6;
                    break;
                case ("VII"):
                    b = 7;
                    break;
                case ("VIII"):
                    b = 8;
                    break;
                case ("IX"):
                    b = 9;
                    break;
                case ("X"):
                    b = 10;
                    break;
                default:
                    b = Integer.parseInt(s2);
            }

            result = a / b;
        }


        System.out.println(result);
    }
}
