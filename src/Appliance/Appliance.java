package Appliance;
//======= abstract class ==========
abstract class Appliance {
    String brand;
    String color;

//========= EMPTY CONSTRUCTOR =======
    public Appliance() {

    }
//========== CONSTRUCTOR ===========
    public Appliance(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

// ========== GETTER AND SETTER ==========
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void makeSound();
    public abstract  void doWork();
}
