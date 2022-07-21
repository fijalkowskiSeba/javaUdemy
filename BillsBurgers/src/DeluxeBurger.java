public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String breadRollType, String meat){
        super(breadRollType,meat, 20);
        super.setAdds(new Chips(),new Drink(),new Addition(),new Addition());
    }

    @Override
    public void setAdds(Addition add1, Addition add2, Addition add3, Addition add4) {
        System.out.println("You can't change adds in Deluxe Burger");
    }
}
