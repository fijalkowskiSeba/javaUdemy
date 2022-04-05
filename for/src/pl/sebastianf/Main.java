package pl.sebastianf;

public class Main {

    public static void main(String[] args) {
//	for (int i =8;i>1;i--) {
//        System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000, i)));
//    }

   int countOfPrime=0;
   int range=10;

   for(int i=1;i<range;i++){
      if(isPrime(i)) {
          System.out.println(i);
          countOfPrime++;
      }
      if (countOfPrime==3) break;
   }
   System.out.println("In range of "+range+" numbers, there is "+ countOfPrime+" prime numbers");

   }



    public static double calculateInterest(double amount,double interestRate){
        return (amount*(interestRate/100));
    }


    public static boolean isPrime(int n){
        if(n==1) return false;

        for(int i=2;i<=n/2;i++){
            if(n%i==0)return false;
        }
        return true;

    }
}
