public class Room {
    private Furniture   window;
    private Furniture   door;
    private Furniture   desk;
    private Person      person1;
    private Person      person2;
    private Cat         cat;

    public Room(Furniture window, Furniture door, Furniture desk, Person person1, Person person2, Cat cat) {
        this.window = window;
        this.door = door;
        this.desk = desk;
        this.person1 = person1;
        this.person2 = person2;
        this.cat = cat;
    }

    public void elementsOfRoom(){
        System.out.println(window.getName()+""+ door.getName()+" "+ desk.getName());
        person1.presentation();
        person2.presentation();
        System.out.println(cat.getName());
    }




}
