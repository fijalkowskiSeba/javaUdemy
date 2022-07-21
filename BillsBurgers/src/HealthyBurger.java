public class HealthyBurger extends Hamburger{
    private Addition add5;
    private Addition add6;

    public HealthyBurger(String meat){
        super("Brown rye bread roll",meat,15);
    }

    public void setExtraAdds(Addition add5, Addition add6) {
        this.add5=add5;
        this.add6=add6;
    }

    @Override
    public int getFullPrice() {
        return super.getFullPrice()+ add5.getPrice()+ add6.getPrice();
    }

    @Override
    protected void printNameAndAdds() {
        super.printNameAndAdds();
        System.out.println("\tAdd #5\t"+add5.getName()+" $"+add5.getPrice());
        System.out.println("\tAdd #6\t"+add6.getName()+" $"+add6.getPrice());
    }

    @Override
    public void print() {
        printNameAndAdds();
        System.out.println("Full price : $"+getFullPrice());
    }
}
