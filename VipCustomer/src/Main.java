public class Main {
    public static void main(String[] args) {
        VipCustomer vip1=new VipCustomer();
        VipCustomer vip2=new VipCustomer("Number2","number2@email.com");
        VipCustomer vip3=new VipCustomer("Number3",123,"email3");

        System.out.println(vip1.getName());
        System.out.println(vip2.getName());
        System.out.println(vip3.getName());
    }
}
