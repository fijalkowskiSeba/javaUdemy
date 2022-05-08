public class LastDigitChecker {

    public static boolean isValid(int number){
        if(number>1000) return false;
        if(number<10) return false;
        return true;
    }

    public static boolean hasSameLastDigit(int first, int second, int third){
        if(!isValid(first)) return false;
        if(!isValid(second)) return false;
        if(!isValid(third)) return false;

        int firstLastDigit =first%10;
        int secondLastDigit =second%10;
        int thirdLastDigit =third%10;

        if(firstLastDigit==secondLastDigit) return true;
        if(firstLastDigit==thirdLastDigit) return true;
        if(secondLastDigit==thirdLastDigit) return true;
        return false;
    }
}
