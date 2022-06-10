public class Main {
    public static void main(String[] args) {
        Room room= new Room(
                new Furniture("Window", new Dimensions(100,100,20),2),
                new Furniture("Door",new Dimensions(90,200,10),1),
                new Furniture("Desk",new Dimensions(120,70,60),1 ),
                new Person("Tom",18),
                new Person("Steve", 20),
                new Cat("Roger","red"));

        room.elementsOfRoom();

    }
}
