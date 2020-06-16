package inheritanceLecture;

public class Vehicle {
    private boolean functionalOrBroken;
    private int passengerCapacity;
    private String powerSource;

//   =========== EMPTY CONSTRUCTOR ===========
    public Vehicle(){

    }
//        ========= CONSTRUCTOR ========
    public Vehicle(boolean functionalOrBroken, int passengerCapacity, String powerSource) {
        this.functionalOrBroken = functionalOrBroken;
        this.passengerCapacity = passengerCapacity;
        this.powerSource = powerSource;
    }
//    ========= GETTER AND SETTER ==========
    public boolean isFunctionalOrBroken() {
        return functionalOrBroken;
    }

    public void setFunctionalOrBroken(boolean functionalOrBroken) {
        this.functionalOrBroken = functionalOrBroken;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "functionalOrBroken=" + functionalOrBroken +
                ", passengerCapacity=" + passengerCapacity +
                ", powerSource='" + powerSource + '\'' +
                '}';
    }
}
