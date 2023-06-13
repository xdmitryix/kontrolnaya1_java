import java.util.ArrayList;
import java.util.List;

public class DropToy {
        public List<Toy> toysToDrop = new ArrayList<>();

    public void addToyDrop (Toy newToy){
        this.toysToDrop.add(newToy);
    }

    public void showAllDrop(){
        for (Toy toysToDrop: this.toysToDrop){
            System.out.println(toysToDrop);
        }
    }

    public void addToysToDrop(Toy toy) {
        toysToDrop.add(toy);
    }
}
