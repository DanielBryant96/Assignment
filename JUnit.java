package Exam;
import org.junit.Test;
import static org.junit.Assert.*;


public class JUnit {

    @Test
    public void tenCharacterMessage(){
        Counter test = new Counter();

        test.addString("hellohello");
        test.addString("stop");


        assertEquals( 10, test.getCharacters());
    }



}
