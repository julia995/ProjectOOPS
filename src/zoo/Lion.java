package zoo;

public class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating meat");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars");
    }

    public void displayInformation() {
        System.out.println("Lion name is " + name + " and age is " + age + " years old.");
    }
}
