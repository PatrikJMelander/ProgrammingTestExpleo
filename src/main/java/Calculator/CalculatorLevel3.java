package Calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by Patrik Melander
 * Date: 2021-03-26
 * Time: 22:33
 * Project: ProgrammingTestExpleo
 * Copyright: MIT
 */

public class CalculatorLevel3 {
    public static double calculate(String input){
        try {
            input = input.trim();
            double result = 0;
            List<String> tmp2;
            List<String> tmp1;

            tmp1 = Arrays.asList(input.split("[0-9]+"));
            tmp2 = Arrays.asList(input.split("[-+*/]"));

            LinkedList<String> operators = new LinkedList<>();
            LinkedList<Double> operands = new LinkedList<>();

            for (int i = 1; i < tmp1.size(); i++) {
                operators.add(tmp1.get(i).trim());
            }
            for (String s : tmp2) {
                operands.add(Double.parseDouble(s.trim()));
            }

            for (int i = 0; i < operators.size(); i++) {
                //loopar igenom operators och räknar ut * och / först
                //Tar bort de operatorer samt operander jag redan använt.

                if (operators.get(i).equals("*")) {
                    operators.remove(i);
                    operands.set(i, (operands.get(i) * operands.get(i + 1)));
                    operands.remove(i + 1);
                    i -= 1;
                    //System.out.println(operands.toString());
                } else if (operators.get(i).equals("/")) {
                    operators.remove(i);
                    operands.set(i, (operands.get(i) / operands.get(i + 1)));
                    operands.remove(i + 1);
                    i -= 1;
                    //System.out.println(operands.toString());
                }
            }
            for (int i = 0; i < operators.size(); i++) {

                if (operators.get(i).equals("+")) {
                    operators.remove(i);
                    operands.set(i, (operands.get(i) + operands.get(i + 1)));
                    operands.remove(i + 1);
                    i -= 1;
                } else if (operators.get(i).equals("-")) {
                    operators.remove(i);
                    operands.set(i, (operands.get(i) - operands.get(i + 1)));
                    operands.remove(i + 1);
                    i -= 1;
                }
            }
            result = operands.get(0);
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
