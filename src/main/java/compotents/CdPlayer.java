package compotents;

public class CdPlayer extends Component implements IPlay {

    private int playtime;

    public CdPlayer(String brand, String model, int playtime){
        super(brand, model);
        this.playtime = playtime;
    }

    public int getPlaytime() {
        return playtime;
    }

    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }

    public String play(String message){
        return message;
    }




}
