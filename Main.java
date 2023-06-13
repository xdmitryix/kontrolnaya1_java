public class Main {
    public static void main(String[] args) {
        Machine_of_toy machine_of_toy = new Machine_of_toy();
        DropToy dropToy = new DropToy();
        int temp;
        machine_of_toy.addToy(new Robot(1, "robot", 20, 10));
        machine_of_toy.addToy(new Constructor(2, "constructor", 20, 15));
        machine_of_toy.addToy(new Doll(3, "doll", 60, 5));
        machine_of_toy.showAll();
        RandomNumber randomNumber = new RandomNumber();
        int numRND = randomNumber.getRandom();
        if ((numRND >= 1) && (numRND <= 20)) {
            temp = 0;
        }else{
            if ((numRND >= 21) && (numRND <= 40)) {
                temp = 1;
            }else{
                temp = 2;
            }
        }
        Toy tempToyDrop = machine_of_toy.getToyAtIndex(temp);
        dropToy.addToysToDrop(tempToyDrop);
        dropToy.showAllDrop();
    }
}