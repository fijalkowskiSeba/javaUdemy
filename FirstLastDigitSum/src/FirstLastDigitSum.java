public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if(number<0) return -1;
        int firstDigit=number%10;
        int lastDigit=0;
        do{
            lastDigit=number%10;
            number/=10;
        }while(number>0);
        return firstDigit+lastDigit;
    }
}
