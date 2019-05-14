import compotents.CdPlayer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CdPlayerTest {

    private CdPlayer cdplayer;

    @Before
    public void before() {
        cdplayer = new CdPlayer("Sony", "DDV12", 20);

    }
    @Test
    public void hasBrand(){
        assertEquals("Sony", cdplayer.getBrand());
    }
    @Test
    public void hasModel(){
        assertEquals("DDV12", cdplayer.getModel());
    }

    @Test
    public void hasPlayTime(){
        assertEquals(20, cdplayer.getPlaytime());
    }
    @Test
    public void canSetBrand(){
        cdplayer.setBrand("Sony2");
        assertEquals("Sony2", cdplayer.getBrand());
    }
    @Test
    public void canSetModel(){
        cdplayer.setModel("DD1");
        assertEquals("DD1", cdplayer.getModel());
    }

    @Test
    public void canSetPlayTime(){
        cdplayer.setPlaytime(22);
        assertEquals(22, cdplayer.getPlaytime());
    }
    @Test
    public void canPlay(){
        String string ="yes";
        assertEquals("yes", cdplayer.play(string));
    }


}
