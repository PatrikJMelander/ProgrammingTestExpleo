import Calculator.CalculatorLevel1;
import Calculator.CalculatorLevel2;
import Calculator.CalculatorLevel3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Patrik Melander
 * Date: 2021-03-26
 * Time: 13:30
 * Project: ProgrammingTestExpleo
 * Copyright: MIT
 */
public class CalculatorTest {
    String testLevel1Value1 ="2+30";
    String testLevel1Value2 ="2 -3";
    String testLevel1Value3 ="2 * 3";
    String testLevel1Value4 ="2 /3 ";

    String testLevel2Value1 ="2+30+4";
    String testLevel2Value2 ="2 - 3 + 4 + 15";
    String testLevel2Value3 ="2 * 3 * 4";
    String testLevel2Value4 ="2 * 3 / 4 * 20";

    String testLevel3Value1 = "2+3*40";
    String testLevel3Value2 = "2 * 3 + 4";
    String testLevel3Value3 = "2 / 3 + 4 - 1";
    String testLevel3Value4 = "2 - 3 * 4";



    @Test
    public void calcTest1(){
        double answer = CalculatorLevel1.calculate(testLevel1Value1);
        assertEquals(32, answer, 0);
    }
    @Test
    public void calcTest2(){
        double answer = CalculatorLevel1.calculate(testLevel1Value2);
        assertEquals(-1, answer, 0);
    }
    @Test
    public void calcTest3(){
        double answer = CalculatorLevel1.calculate(testLevel1Value3);
        assertEquals(6, answer, 0);
    }

    @Test
    public void calcTest4(){
        double answer = CalculatorLevel1.calculate(testLevel1Value4);
        assertEquals(0.66, answer, 0.01);
    }
    @Test
    public void calcTest5(){
        double answer = CalculatorLevel2.calculate(testLevel2Value1);
        assertEquals(36, answer, 0);
    }
    @Test
    public void calcTest6(){
        double answer = CalculatorLevel2.calculate(testLevel2Value2);
        assertEquals(18, answer, 0);
    }
    @Test
    public void calcTest7(){
        double answer = CalculatorLevel2.calculate(testLevel2Value3);
        assertEquals(24, answer, 0);
    }

    @Test
    public void calcTest8(){
        double answer = CalculatorLevel2.calculate(testLevel2Value4);
        assertEquals(30, answer, 0.01);
    }
    @Test
    public void calcTest9(){
        double answer = CalculatorLevel3.calculate(testLevel3Value1);
        assertEquals(122, answer, 0);
    }
    @Test
    public void calcTest10(){
        double answer = CalculatorLevel3.calculate(testLevel3Value2);
        assertEquals(10, answer, 0);
    }
    @Test
    public void calcTest11(){
        double answer = CalculatorLevel3.calculate(testLevel3Value3);
        assertEquals( 3.66666666, answer, 0.01);
    }

    @Test
    public void calcTest12(){
        double answer = CalculatorLevel3.calculate(testLevel3Value4);
        assertEquals(-10, answer, 0);
    }
}
