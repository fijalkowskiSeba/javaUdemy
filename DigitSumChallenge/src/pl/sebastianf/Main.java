package pl.sebastianf;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(10));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(120));
        System.out.println(sumDigits(11111));
    }

    public static int sumDigits(int number){
        if(number<10) return -1;

        int sumOfDigits=0;

        while(number>0){
            sumOfDigits+=number%10;
            number=number/10;
        }
        return sumOfDigits;
    }

}
