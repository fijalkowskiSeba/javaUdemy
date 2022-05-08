public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number<1) return false;

        int copy=number;
        for(int i=1;i<=number/2; i++){
            if(number%i==0) copy-=i;
        }

        if(copy==0) return true;
        return false;
    }
}
