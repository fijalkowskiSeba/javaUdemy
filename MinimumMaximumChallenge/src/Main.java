import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int minimum ;
        int maximum ;

        System.out.println("Enter number:\t");
        if(scanner.hasNextInt()) {
             minimum = scanner.nextInt();
             maximum = minimum;
        }else{
            scanner.nextLine();
            while(true){
                System.out.println("Please enter an INTEGER\t");
                if(scanner.hasNextInt()){
                     minimum = scanner.nextInt();
                     maximum = minimum;
                    break;
                }else scanner.nextLine();
            }
        }

        while (true){
            System.out.println("Enter number:\t");
            if(!scanner.hasNextInt()){
                System.out.println("Minimum:\t"+minimum);
                System.out.println("Maximum:\t"+maximum);
                break;
            }else {
                int temporary=scanner.nextInt();
                if(temporary<minimum) minimum=temporary;
                if(temporary>maximum) maximum=temporary;
            }


        }

        scanner.close();
    }
}
