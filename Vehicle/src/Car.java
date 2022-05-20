public class Car extends Vehicle {
    private int wheels;
    private int gear;

    public Car(String name, int power, int wheels, int gear) {
        super(name, power);
        this.wheels = wheels;
        this.gear = gear;
    }

    public void gearUp(){
        System.out.println("Car gear up");
        gear++;
    }
    public void gearDown(){
        System.out.println("Car gear down");
        gear--;
    }

    public int getGear() {
        return gear;
    }
}
