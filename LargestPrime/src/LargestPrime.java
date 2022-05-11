public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number<=1)return -1;

        for(int i=number;i>1;i--){
            if(number%i==0){
                boolean isPrime=true;
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0) {
                        isPrime=false;
                        break;
                    }
                }
                if (isPrime) return i;
            }
        }
        return -1;
    }

}
