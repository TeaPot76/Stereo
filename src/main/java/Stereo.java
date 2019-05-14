
import compotents.RecordDeck;
import compotents.CdPlayer;
import compotents.Radio;
import compotents.IConnect;

import java.awt.*;
import java.util.Objects;


public class Stereo implements IConnect {


    public Stereo(RecordDeck recordDeck, CdPlayer cdPlayer, Radio radio ){
        super();

    }

    public Stereo connect(Stereo stereo){
        return stereo;
    }
}
