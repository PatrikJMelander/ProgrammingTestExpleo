package Calculator;
import Calculator.CalculatorLevel3;
import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Patrik Melander
 * Date: 2021-03-28
 * Time: 15:56
 * Project: ProgrammingTestExpleo
 * Copyright: MIT
 */
public class CaclulatorConsoleApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Put your mathematical expression");
        while (true) {

            String input = scan.nextLine();
            System.out.println(input);
            if (input.equals(""))
                System.exit(0);
            double output = CalculatorLevel3.calculate(input);

            System.out.println("Result: " + output);
            System.out.println("-------------------------");

            System.out.println("Put a new mathematical expression or press enter to exit");
        }
    }

}
