
public class SimulationManager {

    public static void startSimulation() {
        System.out.println("Simulation Started!\n");

        Dog dog = new Dog("Max");
        Cat cat = new Cat("Luna");
        Bird bird = new Bird("Sky");

        Pet.displaySimulationStats();
        System.out.println();

        dog.eat();
        cat.eat();
        bird.eat();
        System.out.println();

        dog.play();
        cat.play();
        bird.play();
        System.out.println();

        dog.sleep();
        cat.sleep();
        bird.sleep();
        System.out.println();

        String[] conditions = {"Sunny", "Rainy", "Windy", "Cloudy"};
        Random random = new Random();
        Pet.updateEnvironment(conditions[random.nextInt(conditions.length)]);

        Pet.displaySimulationStats();
    }
}
