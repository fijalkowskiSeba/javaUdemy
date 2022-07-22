import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] array){
        System.out.println("Array = "+Arrays.toString(array));
        int temporary;
        int rightPosition;
        for(int i=0; i<(array.length/2);i++){
            temporary=array[i];
            rightPosition=(array.length-i)-1;
            array[i]=array[rightPosition];
            array[rightPosition]=temporary;
        }
        System.out.println("Reversed array = "+Arrays.toString(array));
    }
}
