import SteroStuff.Stereo;
import compotents.CdPlayer;
import compotents.Radio;
import compotents.RecordDeck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StereoTest {

    private Stereo stereo;
    private Radio radio;
    private RecordDeck recordDeck;
    private CdPlayer cdPlayer;



    @Before
    public void before(){
        radio = new Radio("Sony", "DD2");
        cdPlayer = new CdPlayer("Sony", "TD", 20);
        recordDeck = new RecordDeck("Sony", "GF", 20);
        stereo = new Stereo("Sony12", 10, recordDeck, cdPlayer, radio);

    }
    @Test
    public void hasName(){
        assertEquals("Sony12", stereo.getName());

    }
    @Test
    public void hasVolume(){
        assertEquals(10, stereo.getVolume());

    }
    @Test
    public void hasRadio(){
        assertEquals(radio, stereo.getRadio());

    }
    @Test
    public void hasCdPlayer(){
        assertEquals(cdPlayer, stereo.getCdPlayer());

    }
    @Test
    public void hasRecordDeck(){
        assertEquals(recordDeck, stereo.getRecordDeck());

    }

    @Test
    public void canTuneRadio(){
        String station = "BBC1";
        assertEquals("The radio is tuned BBC1", stereo.tuneRadio(station));
    }
    @Test
    public void canPlayCDPlayer() {
        String string = "yes";
        String result = stereo.playCd(string);
        Assert.assertEquals("yes", result);
    }
    @Test
    public void canPlayRecordDeck() {
        String string = "of Course";
        String result = stereo.playRecordDeck(string);
        Assert.assertEquals("of Course", result);
    }


}
