import java.util.Arrays;

/**
 * Created by Patrik Melander
 * Date: 2021-03-26
 * Time: 12:31
 * Project: ProgrammingTestExpleo
 * Copyright: MIT
 */
public class DetectAnagram {

    //Brist, jag kollar inte från början om de är samma!
    public static boolean detectAnagram(String input1, String input2){
        //Börjar med att kolla om båda input1 och input2 är lika stora
        if (input1.length()==input2.length()){
            //Sorterar båda inputsen och jämför char för char om de är lika.
            char[] tmp1 = input1.toLowerCase().toCharArray();
            char[] tmp2 = input2.toLowerCase().toCharArray();
            Arrays.sort(tmp1);
            Arrays.sort(tmp2);
            for (int i = 0; i < tmp1.length; i++) {
                if (tmp1[i]!=tmp2[i]){
                    return false;
                }
            }
        }else return false;
        //Om for-loopen kan gå igenom hela längden returneras true
        return true;
    }
}
