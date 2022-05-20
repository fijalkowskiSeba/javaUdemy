public class Main {
    public static void main(String[] args) {
        ManualCar bmw=new ManualCar("e36",150,4,1,1);

        bmw.move(10);
        bmw.gearUp();
        bmw.turnLeft();
        bmw.move(150);
        bmw.gearDown();
    }
}
