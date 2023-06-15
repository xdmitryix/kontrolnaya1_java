//  Т.К условие и суть задачи считаю не очень понятными, позволил себе скорректировать условие с сдлелал задачу как посчитал логичным.
//  В программе изначально задан массив с игрушками в нём. В числе полей для игрушек есть их количество(которое в данный момент находится в автомате).
//  Производится рандомный розыгрыш игрушки. Эта игрушка добаляется в массив "на выдачу победителю". Количество в изначальном массиве убавляется на один.
//  Так же реализован метод для выдачи приза клиету "give"(игрушка выдается по порядку и удаляется из массива на выдачу).
//  Выданные игрушки записываются в txt-файл. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Machine_of_toy machine_of_toy = new Machine_of_toy();
        DropToy dropToy = new DropToy();
        TextFileWriter textFileWriter = new TextFileWriter("TXTtextFileWriter");
        int temp;
        machine_of_toy.addToy(new Robot(1, "robot", 20, 1));
        machine_of_toy.addToy(new Constructor(2, "constructor", 20, 1));
        machine_of_toy.addToy(new Doll(3, "doll", 60, 1));
        System.out.println("Начальный список игрушек в автомате:\n");
        machine_of_toy.showAll();
        System.out.println("");
        System.out.println("список команд:\n drop-добавить игрушку в список на выдачу\n show-показать оставшиеся игрушки в автомате\n shdr-показать список игрушек на выдачу\n give-выдать игрушку по порядку\n help-список команд\n exit-выход\n");


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
                    }else{
                        if (command.equals("give")){
                            int dropEmpty = dropToy.isEmptyList();
                            if (dropEmpty == 1){      
                                System.out.println("все игрушки уже раздали победителям!");
                                textFileWriter.write("все игрушки уже раздали победителям!");                          
                            }else{
                                System.out.println("Игрушка выдана победителю:\n" + dropToy.getToysToDropIndex(0));
                                textFileWriter.write("Игрушка выдана победителю:\n" + dropToy.getToysToDropIndex(0));
                                dropToy.dellDropIndex(0);
                            }
                        }else{
                            if (command.equals("exit")){
                                break;
                            }else{
                                if (command.equals("help")){
                                    System.out.println("список команд:\n drop-добавить игрушку в список на выдачу\n show-показать оставшиеся игрушки в автомате\n shdr-показать список игрушек на выдачу\n give-выдать игрушку по порядку\n help-список команд\n exit-выход\n");
                                }else{
                                    System.out.println("некорректная команда!");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}