package Calculator;
/**
 * Created by Patrik Melander
 * Date: 2021-03-26
 * Time: 20:18
 * Project: ProgrammingTestExpleo
 * Copyright: MIT
 */

public class CalculatorLevel1 {
    public static double calculate(String input){
        String value = input.trim();

        String firstNumberString;
        String secondNumberString;
        String operator;
        int operatorPosition;
        double firstNumber;
        double secondNumber;
        double result = 0;
        try {

            operatorPosition = searchForOperandsLevel1(value, " +-*/", 1); // Kollar på vilket index operatorn är. Startar på index 1 om första talet skulle vara negativt

            //Använder operatorPosition för att ta ut första och andra talet samt vilken operator det är.
            firstNumberString = value.substring(0, operatorPosition).trim();
            operator = value.substring(operatorPosition, operatorPosition + 1);
            secondNumberString = value.substring(operatorPosition + 1).trim();

            firstNumber = Integer.parseInt(firstNumberString);
            secondNumber = Integer.parseInt(secondNumberString);

            switch (operator) {
                case "+" -> result = firstNumber + secondNumber;
                case "-" -> result = firstNumber - secondNumber;
                case "*" -> result = firstNumber * secondNumber;
                case "/" -> result = firstNumber / secondNumber;
            }


        }catch (NumberFormatException e){
            System.out.println("only digits and match expression. Try again");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(input + ": is not a correct match expression. Try again");
        }catch (ArithmeticException e) {
            System.out.println("You are not allowed to divide(/) with 0. Try again");
        }catch (Exception e){
            System.out.println("Something went wrong. Try again");
        }
        return result;
    }

    public static int searchForOperandsLevel1 (String s, String search, int start){

        for (int i = start; i < s.length() ; i++){
            if (search.indexOf(s.charAt(i)) > 0)
                return i;
        }
        return  -1;
    }
}
