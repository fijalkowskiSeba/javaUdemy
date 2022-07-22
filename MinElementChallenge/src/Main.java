import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter count: ");
        Scanner scanner =new Scanner(System.in);
        int count =scanner.nextInt();

        System.out.println("Enter numbers: ");
        int[] array=MinElement.readElements(count);
        System.out.println("Min element: "+MinElement.findMin(array));
    }
}
