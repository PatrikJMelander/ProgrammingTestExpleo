package Calculator;
/**
 * Created by Patrik Melander
 * Date: 2021-03-26
 * Time: 21:39
 * Project: ProgrammingTestExpleo
 * Copyright: MIT
 */

public class CalculatorLevel2 {

    public static double calculate(String input) {
        try {
            String value = input.trim();

            //Skapar Arrayer för både operander och operatorer
            String[] operators = value.split("[0-9]+");
            String[] operands = value.split("[-+*/]");

            for (int i = 0; i < operands.length; i++) {
                operands[i] = operands[i].trim();
            }
            for (int i = 0; i < operators.length; i++) {
                operators[i] = operators[i].trim();
            }

            double result = Integer.parseInt(operands[0]);
            for (int i = 1; i < operands.length; i++) {
                switch (operators[i]) {
                    case "+" -> result += Double.parseDouble(operands[i]);
                    case "-" -> result -= Double.parseDouble(operands[i]);
                    case "*" -> result *= Double.parseDouble(operands[i]);
                    case "/" -> result /= Double.parseDouble(operands[i]);
                }
            }
            return result;
        }catch (NumberFormatException e){
            System.out.println("only digits and math expression. Try again");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(input + ": is not a correct math expression. Try again");
        }catch (ArithmeticException e) {
            System.out.println("You are not allowed to divide(/) with 0. Try again");
        }catch (Exception e){
            System.out.println("Something went wrong. Try again");
        }
        return 0;
    }
}
