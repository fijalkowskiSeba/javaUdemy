package pl.sebastianf;

public class Main {

    public static void main(String[] args) {

//        boolean isAlien= true;
//        if(isAlien==false){
//            System.out.println("It is not an alien!");
//        }
//
//        boolean isCar =false;
//
//        boolean wasCar= isCar ? true : false;
//        if (wasCar) System.out.println("This was a car");
//        else System.out.println("This wasn't a car");

        double firstValue = 20.00;
        double secondValue = 80.00;
        double result=(firstValue+secondValue)*100.00;
        System.out.println("first + second = "+result);
        result%=40.00;
        System.out.println("theReminder = "+ result);
        boolean isZero=(result==0);
        System.out.println("is no reminder = "+isZero);

        String remainderZero="Remainder is equal to zero";
        String remainderNotZero="Remainder isn't equal to zero";
        String answer= isZero ?  remainderZero : remainderNotZero;
        System.out.println(answer);


    }
}
