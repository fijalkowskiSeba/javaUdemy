public class Main {
    public static void main(String[] args) {

        Hamburger hamburger =new DeluxeBurger("regular","beef");
        hamburger.setAdds(new Tomato(),new Tomato(),new Tomato(),new Tomato());
        hamburger.print();

    }
}
