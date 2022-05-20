import java.util.Stack;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int numberCopy=Math.abs(number);

        Stack<Integer> myStack= new Stack<>();

        while(numberCopy>0){
            myStack.push(numberCopy%10);
            numberCopy/=10;
        }

        int reversedNumber=0;
        int multiplier=1;

        while(!myStack.empty()){
            reversedNumber+=myStack.pop()*multiplier;
            multiplier*=10;
        }
////
        while(number>0){
            int lastDigit=number%10;
            number/=10;

            int firstDigit=reversedNumber%10;
            reversedNumber/=10;

            if(lastDigit!=firstDigit) return false;
        }


        return true;
    }

}
