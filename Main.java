package Lesson6;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Cats");
        Cat cat = new Cat("Vasia", 200, false);
        animal.poAnim();
        cat.poAnim();
        cat.Cats();

        Animal danimal = new Animal("Dogs");
        Dog dog = new Dog("Masia", 500, 10);
        danimal.poAnim();
        dog.poAnim();
        dog.Dogs();

    }
}