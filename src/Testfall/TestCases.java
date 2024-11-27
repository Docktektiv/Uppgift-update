package Testfall;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import java.util.stream.IntStream;


public class TestCases {

    @Test
    public void firstTestCase() {

        //Test_1_text bingo = new Test_1_text();

        //bingo.Test_1_text(input);

        //String text = bingo.toString();
        //int value = bingo.Test_1_text(input);

        String text = "Hej!";
        int value = text.length();

        if (value >= 10){
            boolean actual = true;
            boolean expected = true;
            assertEquals(expected, actual);

        } else {
            boolean actual = false;
            boolean expected = true;
            assertEquals(expected, actual);
        }
    }

    @Test
    public void secondTestCase(){

        int[] nummer = {16, 32, 64};
        int summa = IntStream.of(nummer).sum();

        int actual = summa;
        int expected = 112;
        assertEquals(expected, actual);
    }
}
