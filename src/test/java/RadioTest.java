import compotents.Radio;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void before(){

        radio = new Radio("Sony", "DDC");
    }

    @Test
    public void tune(){
        String string = "BBC";
        assertEquals("BBC", radio.tune(string));
    }


}
