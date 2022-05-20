import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int validNumbersCounter=0;
        int sum=0;
        while(validNumbersCounter!=10){
            if(!scanner.hasNextInt()){
                System.out.println("Invalid input");
                scanner.nextLine();
            }else{
                sum+=scanner.nextInt();
                validNumbersCounter++;
            }

        }
        System.out.println("Sum of numbers = "+sum);
        scanner.close();
    }
}
