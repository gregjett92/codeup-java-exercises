package inheritanceLecture;

public class Dog extends Animal {

    private String breed;
    private String name;
    private String nameOfOwner;

    public String getBreed() {
        return breed;
    }

    public Dog(String species, int age, String breed){
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

    public int makeNoise(int x) {
        return 3;
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

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.makeNoise(3));
    }

}
