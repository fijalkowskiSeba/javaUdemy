import java.util.Scanner;

public class MinElement {
    private static Scanner scanner=new Scanner(System.in);

    private static int readInteger(){
        int count=scanner.nextInt();
        return count;
    }
    public static int[] readElements(int count){
        int [] array=new int[count];
        for(int i=0;i<count;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min) min=array[i];
        }
        return min;
    }
}
