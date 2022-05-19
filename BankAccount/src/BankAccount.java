public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public String getAccountNumber(){return accountNumber;}
    public double getBalance(){return balance;}
    public String getCustomerName(){return customerName;}
    public String getEmail(){return email;}
    public String getPhoneNumber(){return phoneNumber;}

    public void setAccountNumber(String accountNumber){this.accountNumber=accountNumber;}
    public void setBalance(double balance){this.balance=balance;}
    public void setCustomerName(String customerName){this.customerName=customerName;}
    public void setEmail(String email){this.email=email;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber=phoneNumber;}

    public void depositFunds(double newFounds){
        if(newFounds>0) balance+=newFounds;
        System.out.println("You added $"+newFounds+ " to your account");
        System.out.println("Your balance is: $"+ balance);
    }
    public void withdrawFunds(double fundToWithdraw){
        if(fundToWithdraw>balance){
            System.out.println("Your balance is $"+balance);
            System.out.println("You can't withdraw $"+fundToWithdraw);
        }else{
            balance-=fundToWithdraw;
            System.out.println("You withdraw $"+ fundToWithdraw);
            System.out.println("Your balance is: $"+ balance);
        }
    }
}
