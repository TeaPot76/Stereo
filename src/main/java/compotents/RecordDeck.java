package compotents;



public class RecordDeck extends Component implements IPlay {

    private int playSpeed;

    public RecordDeck(String brand, String model, int playSpeed) {
        super(brand, model);
        this.playSpeed = playSpeed;
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public void setPlaySpeed(int playSpeed) {
        this.playSpeed = playSpeed;
    }

    public String play(String string){
        return string;
    }
}
