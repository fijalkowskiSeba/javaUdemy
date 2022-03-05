package pl.sebastianf;

public class Main {

    public static void main(String[] args) {

        int myValue=10_000;
        System.out.println("myValue= "+myValue);

        int myIntMinValue=Integer.MIN_VALUE;
        int myIntMaxValue=Integer.MAX_VALUE;

        System.out.println("Integer minimum value="+myIntMinValue);
        System.out.println("Integer maximum value="+myIntMaxValue);
        System.out.println("Busted MAX value= "+(myIntMaxValue+1));
        System.out.println("Busted MIN value= "+(myIntMinValue-1));

    }
}
