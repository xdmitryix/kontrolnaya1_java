import java.util.ArrayList;
import java.util.List;

public class Machine_of_toy {
    public List<Toy> toysInMachine = new ArrayList<>();

    public void addToy (Toy newToy){
        this.toysInMachine.add(newToy);
    }

    public void toyRemove(Toy rmToy){
        this.toysInMachine.remove(rmToy)
    }

    public void showAll(){
        for (Toy toysInMachine: this.toysInMachine){
            System.out.println(toysInMachine);
        }
    }

    public Toy getToyAtIndex(int index) {
        return toysInMachine.get(index);
    }



}
