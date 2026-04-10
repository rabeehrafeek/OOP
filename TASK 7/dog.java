
public class Dog extends Pet {

    public Dog(String petName) {
        super(petName);
    }

    @Override
    public void eat() {
        energy += 20;
        if (energy > 100) energy = 100;
        System.out.println(petName + " wags its tail while eating!");
    }

    @Override
    public void play() {
        energy -= 30;
        if (energy < 0) energy = 0;
        System.out.println(petName + " runs around happily while playing!");
    }

    @Override
    public void sleep() {
        energy = 100;
        System.out.println(petName + " is sleeping...");
    }
}
