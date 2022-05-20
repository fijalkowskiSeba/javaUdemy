public class Vehicle {
    private String name;
    private int power;

    public Vehicle(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void move(int howFar){
        System.out.println("Vehicle moves "+ howFar);
    }

    public void turnLeft(){
        System.out.println("Vehicle turns left");
    }

    public void turnRight(){
        System.out.println("Vehicle turns right");
    }
}
