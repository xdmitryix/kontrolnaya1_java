public class Main {
    public static void main(String[] args) {
        Machine_of_toy machine_of_toy = new Machine_of_toy();
        machine_of_toy.addToy(new Robot(1, "robot", 20, 10));
        machine_of_toy.addToy(new Constructor(2, "constructor", 20, 15));
        machine_of_toy.addToy(new Doll(3, "doll", 60, 5));
        machine_of_toy.showAll();
    }
    
}