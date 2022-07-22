import java.util.Scanner;

public class SortedArray {




    public static int[]getIntegers(int number){
        int[] values = new int[number];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<number;i++){
            if(i!=number-1){
            System.out.print(values[i]+", ");
            }else {
                System.out.print(values[i]);
            }

        }
        System.out.print("]\n");
        return values;
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+i+ " contents "+ array[i]);
        }
    }

    public static int[]  sortIntegers(int[] oldArray){
        int[] array=new int[oldArray.length];
        for(int i =0;i<oldArray.length;i++){
            array[i]=oldArray[i];
        }
        for(int i = 0;i<array.length;i++){
            int right=i;
            for(int j=right-1;j>=0;j--){
                if(array[j]<array[right]){
                    int c =array[right];
                    array[right]=array[j];
                    array[j]=c;
                    right--;
                    continue;
                }
                break;
            }
        }
        return array;
    }
}