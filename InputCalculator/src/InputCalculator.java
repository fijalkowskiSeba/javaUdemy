import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner=new Scanner(System.in);

        int sum=0;
        int counter=0;

        while(true){
            if(scanner.hasNextInt()){
                sum+= scanner.nextInt();
                counter++;
            }else{
                scanner.nextLine();
                System.out.println("SUM = "+sum+" AVG = "+Math.round((double) sum/counter));
                break;
            }
        }


        scanner.close();
    }
}
