public class ManualCar extends Car{
    int stick;

    public ManualCar(String name, int power, int wheels, int gear, int stick) {
        super(name, power, wheels, gear);
        this.stick = stick;
    }

    @Override
    public void gearUp() {
        super.gearUp();
        stickOn();
    }

    @Override
    public void gearDown() {
        super.gearDown();
        stickOn();
    }

    private void stickOn(){
        System.out.println("Stick on position "+super.getGear());
    }
}
