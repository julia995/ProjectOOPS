package zoo;

public class Simulation {
    public static void main(String[] args) {
        // Creating and testing animals
        Animal lion = new Lion("Leo", 5);
        Animal parrot = new Parrot("Jim", 2);

        // Display information and demonstrate polymorphism
        Animal[] animals = {lion, parrot};
        for (Animal animal : animals) {
            animal.displayInformation();
            animal.eat();
            animal.makeSound();
            animal.sleep();
        }
    }
}
