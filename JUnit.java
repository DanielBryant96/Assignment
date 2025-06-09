package Exam;
import org.junit.Test;
import static org.junit.Assert.*;


public class JUnit {

    @Test
    public void tenCharacterMessage(){
        Counter test = new Counter();

        test.addChars("hellohello");
        test.addChars("stop");

        test.charSum();

        assertEquals(test.getCharacters(), 10);

        Counter test2 = new Counter();

        test2.addChars("hello");
        test2.addChars("hello");
        test2.addChars("stop");

        test2.charSum();

        assertEquals(test2.getCharacters(), 10);
    }


}
