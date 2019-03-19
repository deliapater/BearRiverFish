import java.util.ArrayList;

public class River {
    private String name;
    private ArrayList<Fish> fish;

    public River(String amazon){
        this.name = name;
        this.fish = new ArrayList<Fish>();
    }

    public void add(Fish fish){
        this.fish.add(fish);
    }

    public int fishCount() {
        return this.fish.size();
    }

    public Fish removeFish() {
        return this.fish.remove(0);
    }
}
