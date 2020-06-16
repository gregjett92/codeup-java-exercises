package inheritanceLecture;

import inheritanceLecture.Animal;

public class Dog extends Animal {

    private String breed;
    private String name;
    private String nameOfOwner;

    public void soutProtectedProp() {
        System.out.println(protectedProp);
    }

    public String getBreed() {
        return breed;
    }

    // unique method to the Dog class
    public void fetchBall() {
        System.out.println("Dog is fetching the ball...");
    }

    public Dog(String species, int age, String breed, String name, String nameOfOwner) {
        super(species, age);
        this.breed = breed;
        this.name = name;
        this.nameOfOwner = nameOfOwner;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("BARK BARK!!!");
    }

    // method overloading
    public void makeNoise(String noise) {
        System.out.println(noise);
    }

    public void makeGenericAnimalNoise() {
        super.makeNoise();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "species='" + this.getSpecies() + '\'' +
                ", age=" + this.getAge()  +
                ", breed='" + breed + '\'' +
                '}';
    }


}