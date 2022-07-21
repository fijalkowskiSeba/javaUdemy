public class Hamburger {

    private String breadRollType;
    private String meat;
    private Addition add1;
    private Addition add2;
    private Addition add3;
    private Addition add4;
    private int price;

    public Hamburger(String breadRollType, String meat, int price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price=price;
        add1=new Addition();
        add2=new Addition();
        add3=new Addition();
        add4=new Addition();
    }

    public void setAdds(Addition add1,Addition add2,Addition add3,Addition add4){
        this.add1=add1;
        this.add2=add2;
        this.add3=add3;
        this.add4=add4;
    }

    public int getFullPrice(){
        int sum=price+add1.getPrice()+add2.getPrice()+ add3.getPrice()+ add4.getPrice();
        return sum;
    }

    protected void printNameAndAdds(){
        System.out.println(getClass().getSimpleName());
        System.out.println("Bread roll type :\t"+breadRollType);
        System.out.println("Meat :\t"+meat);
        System.out.println("\tAdd #1\t"+add1.getName()+" $"+add1.getPrice());
        System.out.println("\tAdd #2\t"+add2.getName()+" $"+add2.getPrice());
        System.out.println("\tAdd #3\t"+add3.getName()+" $"+add3.getPrice());
        System.out.println("\tAdd #4\t"+add4.getName()+" $"+add4.getPrice());
    }

    public void print(){
        printNameAndAdds();
        System.out.println("Full price : $"+getFullPrice());
    }

}
