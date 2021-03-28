import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Patrik Melander
 * Date: 2021-03-26
 * Time: 12:37
 * Project: ProgrammingTestExpleo
 * Copyright: MIT
 */
public class DetectAnagramTest {
    String testValue1 = "marya";
    String testValue2 = "Yrama";
    String testValue3 = "wrong";
    String testValue4 = "raMaY";
    String testValue6 = "maryb";


    @Test
    public void isAnagamTest1(){
        boolean answer = DetectAnagram.detectAnagram(testValue1, testValue2);
        assertEquals(true, answer);
    }
    @Test
    public void isAnagamTest2(){
        boolean answer = DetectAnagram.detectAnagram(testValue1, testValue4);
        assertEquals(true, answer);
    }
    @Test
    public void isNotAnagamTest1(){
        boolean answer = DetectAnagram.detectAnagram(testValue1, testValue3);
        assertEquals(false, answer);
    }
    @Test
    public void isNotAnagamTest2(){
        boolean answer = DetectAnagram.detectAnagram(testValue1, testValue6);
        assertEquals(false, answer);
    }
}
