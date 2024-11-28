package Testfall;

import Inlämning.Counter;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import java.util.stream.IntStream;


public class TestCases {

    @Test
    public void firstTestCase() {

        String text = "Hej på dig!";
        int value = text.length();

        boolean actual;
        boolean expected = true;
        if (value >= 10){
            actual = true;

        } else {
            actual = false;
        }
        assertEquals(expected, actual);
    }

    @Test
    public void secondTestCase(){

        int[] nummer = {16, 32, 64};

        int actual = IntStream.of(nummer).sum();
        //int expected = 112;
        assertEquals(112, actual);
    }

    @Test
    void thirdTestCase() {

        Counter counter;
        counter = new Counter();
        counter.Matte("Hello");
        counter.Matte("World");
        counter.Matte("stop");

        assertEquals(2, counter.getTotalLines());
        assertEquals(10, counter.getTotalCharacters());
    }


}
