public class Main {

    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount();
        myAccount.setBalance(1000);
        myAccount.depositFunds(500);
        myAccount.withdrawFunds(2000);
        myAccount.withdrawFunds(1500);
    }
}
