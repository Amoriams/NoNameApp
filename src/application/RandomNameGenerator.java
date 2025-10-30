package application;
import java.util.Random;
import entities.LoginSystem;


public class RandomNameGenerator {
    public static String generante(){
        Random random = new Random();
        int number = random.nextInt(1000);
        return LoginSystem.getNome() + number;
    }
}
