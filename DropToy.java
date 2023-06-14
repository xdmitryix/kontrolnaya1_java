import java.util.ArrayList;
import java.util.List;

public class DropToy {
        public List<Toy> toysToDrop = new ArrayList<>();

    public void addToyDrop (Toy newToy){
        this.toysToDrop.add(newToy);
    }

    public Toy getToysToDropIndex(int index) {
    return toysToDrop.get(index);
    }

    public void showAllDrop(){
        for (Toy toysToDrop: this.toysToDrop){
            System.out.println(toysToDrop);
        }
    }

    public int isEmptyList(){
        if (toysToDrop.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }

    public void dellDropIndex(int index){
        this.toysToDrop.remove(index);
    }

    public int getLengthDropArr(){
        return toysToDrop.size()-1;
    } 

    public void addToysToDrop(Toy toy) {
        toysToDrop.add(toy);
    }
}
