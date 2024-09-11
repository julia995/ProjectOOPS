package zoo;

public class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating seeds.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " squawks.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Parrot's name is " + name + " and age is " + age + " years old.");

    }
}
