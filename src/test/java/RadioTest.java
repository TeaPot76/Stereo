import compotents.CdPlayer;
import org.junit.Before;

public class RadioTest {

    private CdPlayer.Radio radio;

    @Before
    public void before(){
        radio = new CdPlayer.Radio("Sony", "DDC");
    }


}
