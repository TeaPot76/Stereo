import SteroStuff.MP3Player;
import SteroStuff.Stereo;
import compotents.CdPlayer;
import compotents.Radio;
import compotents.RecordDeck;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MP3PlayerTest {

    private Radio radio;
    private CdPlayer cdPlayer;
    private RecordDeck recordDeck;
    private MP3Player mp3;
    private Stereo stereo;

    @Before
    public void before(){
        stereo = new Stereo("Sony", 15, recordDeck, cdPlayer, radio);
        mp3 = new MP3Player("Sony7", "BlackRR");
    }
    @Test
    public void hasMake(){
        assertEquals("Sony", mp3.getMake());
    }
    @Test
    public void hasModel(){
        assertEquals("BlackRR", mp3.getMake());
    }
    @Test
    public void canConnect(){
        String result = stereo.getName();
        assertEquals("Connected to: " + result, mp3.connect(stereo));
    }
}
