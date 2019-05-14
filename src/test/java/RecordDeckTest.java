import compotents.RecordDeck;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RecordDeckTest {

    private RecordDeck recordDeck;



    @Before
    public void before() {
        recordDeck = new RecordDeck("Sony", "DDV12", 20);

    }
    @Test
    public void hasBrand(){
        assertEquals("Sony", recordDeck.getBrand());
    }
    @Test
    public void hasModel(){
        assertEquals("DDV12", recordDeck.getModel());
    }

    @Test
    public void hasPlayTime(){
        assertEquals(20, recordDeck.getPlaySpeed());
    }
    @Test
    public void canSetBrand(){
        recordDeck.setBrand("Sony2");
        assertEquals("Sony2", recordDeck.getBrand());
    }
    @Test
    public void canSetModel(){
        recordDeck.setModel("DD1");
        assertEquals("DD1", recordDeck.getModel());
    }

    @Test
    public void canSetPlayTime(){
        recordDeck.setPlaySpeed(22);
        assertEquals(22, recordDeck.getPlaySpeed());
    }
    @Test
    public void canPlay(){
        assertEquals(true, recordDeck.play());
    }


}
