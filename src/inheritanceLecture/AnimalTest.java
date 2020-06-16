package inheritanceLecture;

import java.util.ArrayList;

public class AnimalTest {

    public static void makeAnimalsNoisy(Animal[] animals) {
        for (Animal a : animals) {
            a.makeNoise();
        }
    }

    public static void main(String[] args) {

        Dog d = new Dog(
                "Canine",
                3,
                "Pug",
                "Mr. Freckles",
                "Mr. Smith");

        Cat c = new Cat("Feline", 7, 9);

//        d.makeNoise();
//        c.makeNoise();


        // creating an array to hold any object that extends from type animal
        Animal[] animals = new Animal[2];
        animals[0] = d; // assign our dog object
        animals[1] = c; // assign our cat object


        // example of casting to use a sub-type specific field
        Dog dog = (Dog) animals[0];
        dog.fetchBall();


        makeAnimalsNoisy(animals); // calling a method that uses array of animals



    }
}