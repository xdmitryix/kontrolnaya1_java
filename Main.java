import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Machine_of_toy machine_of_toy = new Machine_of_toy();
        DropToy dropToy = new DropToy();
        int temp;
        machine_of_toy.addToy(new Robot(1, "robot", 20, 1));
        machine_of_toy.addToy(new Constructor(2, "constructor", 20, 1));
        machine_of_toy.addToy(new Doll(3, "doll", 60, 1));
        System.out.println("Начальный список игрушек в автомате:\n");
        machine_of_toy.showAll();

        while(true){
            Scanner iScanner = new Scanner(System.in, "Cp866");
            System.out.println("введи команду: ");
            String command = iScanner.nextLine();
            if (command.equals("drop")) {
                RandomNumber randomNumber = new RandomNumber();
                int numRND = randomNumber.getRandom();
                if ((numRND >= 1) && (numRND <= 20)) {
                    temp = 0;
                    System.out.println("Выпал робот!");
                }else{
                    if ((numRND >= 21) && (numRND <= 40)) {
                        temp = 1;
                        System.out.println("Выпал конструктор!");
                    }else{
                        System.out.println("Выпала кукла!");
                        temp = 2;
                    }
                }
                Toy tempToyDrop = machine_of_toy.getToyAtIndex(temp);
                if ((machine_of_toy.getToyAtIndex(temp).getQuantity()) >= 1) {
                    dropToy.addToysToDrop(tempToyDrop);
                    int quantityTemp = (machine_of_toy.getToyAtIndex(temp)).getQuantity();
                    (machine_of_toy.getToyAtIndex(temp)).setQuantity(--quantityTemp);
                    // int sizeDropToy = dropToy.getLengthDropArr();
                    // dropToy.getToysToDropIndex(sizeDropToy).setQuantity(1);
                }else{
                    System.out.println("к сожалению эта игрушка уже заклнчилась в автомате. попробуйте ещё раз!");
                }
            }else{
                if(command.equals("show")){
                    System.out.println("Оставшийстя список игрушек в автомате:\n");
                    machine_of_toy.showAll();
                }else{
                    if(command.equals("shdr")){
                        System.out.println("Список игрушек на выдачу:\n");
                        dropToy.showAllDrop();
                    }
                }
            }
        }
    }
}