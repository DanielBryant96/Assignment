package Exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CounterTest {



    @Test
    void addString() {
        Counter test = new Counter();

        assertTrue(test.addString("danneb"));

        assertFalse(test.addString("stop"));

    }

    @Test
    void getRows() {
        Counter test = new Counter();

        test.addString("hej");
        test.addString("hej");
        test.addString("hej");
        test.addString("stop");

        assertEquals(3, test.getRows());

    }

    @Test
    void getCharacters() {

        Counter test = new Counter();

        test.addString("hejan ");
        test.addString("hej");
        test.addString("stop");

        assertEquals(9, test.getCharacters());
    }

    @Test
    void getLongestWord() {

        Counter test = new Counter();

        test.addString("et e");
        test.addString("ett");
        test.addString("stop");

        assertEquals("ett", test.getLongestWord());
    }

    @Test
    void getWordsAmount() {

        Counter test = new Counter();

        test.addString("hej här   har vi några ord");
        test.addString("mågra fler");
        test.addString("stop");

        assertEquals(8, test.getWordsAmount());
    }
}