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
    public boolean play(){
        return true;
    }

    public abstract static class Component {

        private String brand;
        private String model;

        public Component(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }

    public static class Radio extends Component {

        private Radio radio;

        public Radio(String brand, String model){
            super(brand, model);
        }

        public String tune(){
            return "BBC1";
        }
    }
}
