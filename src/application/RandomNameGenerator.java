package application;
import java.util.Random;


public class RandomNameGenerator {
    public static String generante(){
        Random random = new Random();
        int number = random.nextInt(1000);
        return "User_" + number;
    }
}
