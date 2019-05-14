package SteroStuff;

import compotents.CdPlayer;
import compotents.Radio;
import compotents.RecordDeck;


public class Stereo {
    private String name;
    private int volume;
    private RecordDeck recordDeck;
    private CdPlayer cdPlayer;
    private Radio radio;


    public Stereo(String name, int volume, RecordDeck recordDeck, CdPlayer cdPlayer, Radio radio ){
    this.name= name;
    this.volume = volume;
    this.recordDeck = recordDeck;
    this.cdPlayer = cdPlayer;
    this.radio = radio;

    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public RecordDeck getRecordDeck() {
        return recordDeck;
    }

    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }

    public Radio getRadio() {
        return radio;
    }
    public String tuneRadio(String station){
        return "The radio is tuned " + radio.tune(station);
    }
    public String playCd(String string){
        return cdPlayer.play(string);
    }

    public String playRecordDeck(String string) {
        return recordDeck.play(string);
    }
}
