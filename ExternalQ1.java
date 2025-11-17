
abstract class Animal {

    abstract void makeSound();
}
interface AnimalActions {

    void makeSoundFromInterface();
}
class Dog extends Animal implements AnimalActions {

    public void makeSound() {
        System.out.println("Dog: Woof!");
    }

    public void makeSoundFromInterface() {
        System.out.println("Dog (interface): Woof!");
    }
}
public class ExternalQ1 {
    public static void main(String[] args) {
        Dog pet = new Dog();
        pet.makeSound();
        pet.makeSoundFromInterface();
    }
}
