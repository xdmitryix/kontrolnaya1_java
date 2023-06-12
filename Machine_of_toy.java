import java.util.ArrayList;
import java.util.List;

public class Machine_of_toy {
    private List<Toy> toysInMachine = new ArrayList<>();

    public void addToy (Toy newToy){
        this.toysInMachine.add(newToy);
    }

    public void showAll(){
        for (Toy toysInMachine: this.toysInMachine){
            System.out.println(toysInMachine);
        }
    }
}
