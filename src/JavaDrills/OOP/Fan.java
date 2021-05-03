package JavaDrills.OOP;

public class Fan {
    //state
    private String make;
    private Double radius;
    private String color;


    private Boolean isOn;
    private byte speed;

    //creation
    public Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    //isOn

//    public void isOn(boolean isOn) {
//        this.isOn = isOn;
//    }

    //This solution is more useful for a consumer as opposed to the solution above

    public void switchOn() {
        this.isOn = true;
        setSpeed((byte)5);
    }

    public void switchOff() {
        this.isOn = false;
        setSpeed((byte)0);
    }

    public void setSpeed(byte speed){
        this.speed = speed;
    }

    //Print state
    public String toString() {
        return String.format("Make: %s, Radius: %f, Color: %s isOn: %b, Speed: %d", make, radius, color,isOn,speed);
    }

}
