
import java.util.Random;

public class Bird extends Pet {
    private Random random = new Random();

    public Bird(String petName) {
        super(petName);
    }

    @Override
    public void eat() {
        energy += 10;
        if (energy > 100) energy = 100;
        System.out.println(petName + " pecks at its food quickly.");
    }

    @Override
    public void play() {
        int energyLoss = random.nextInt(21) + 10; // 10–30
        energy -= energyLoss;
        if (energy < 0) energy = 0;
        System.out.println(petName + " soars through the sky!");
    }

    @Override
    public void sleep() {
        energy += 30;
        if (energy > 100) energy = 100;
        System.out.println(petName + " is sleeping...");
    }
}
