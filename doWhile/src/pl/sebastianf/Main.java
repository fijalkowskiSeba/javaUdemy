package pl.sebastianf;

public class Main {

    public static boolean isEvenNumber(int number){
        if(number%2==0) return true;
        return false;
    }

    public static void main(String[] args) {
	// write your code

        int number=4;
        int finishNumber=20;
        int countEven=0;
        while(number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number "+ number);
            countEven++;

            if(countEven==5) {
                System.out.println("Total number of found even numbers is "+countEven);
                break;
            }

        }
    }
}
