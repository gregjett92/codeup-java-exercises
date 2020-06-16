package inheritanceLecture;

public class Car extends Vehicle {
    private int milesPerGallon;

    public Car(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public void deployAirBag() {
        System.out.println("Deploy");
    }
}
