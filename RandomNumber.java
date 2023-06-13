import java.util.Random;

public class RandomNumber {

    public int getRandom(){
        Random random = new Random();
        return random.nextInt(1, 100);
    }


}
