package Testfall;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class Test_1 {

    @Test
    public void firstTestCase() {

        String text = "Hej på dig!";
        int value = text.length();

        if (value > 10){
            boolean actual = true;

            boolean expected = true;
            assertEquals(expected, actual);
        }
        //int expected = 11;


    }

}
