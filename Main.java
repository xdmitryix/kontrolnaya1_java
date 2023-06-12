public class Main {
    public static void main(String[] args) {
        Machine_of_toy machine_of_toy = new Machine_of_toy();
        machine_of_toy.addToy(new Doll(1, "doll1", 20));
        machine_of_toy.addToy(new Robot(2, "robot1", 20));
        machine_of_toy.addToy(new Constructor(1, "constructor1", 60));
        machine_of_toy.showAll();
    }
    
}