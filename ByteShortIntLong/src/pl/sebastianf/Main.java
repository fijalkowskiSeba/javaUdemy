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

        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("Byte minimum value= "+myMinByteValue);
        System.out.println("Byte maximum value= "+myMaxByteValue);

        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("short minimum value= "+myMinShortValue);
        System.out.println("short maximum value= "+myMaxShortValue);


        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("long minimum value= "+myMinLongValue);
        System.out.println("long maximum value= "+myMaxLongValue);

        short bigShortLiteralValue = 32_677;

        int myTotal=(myIntMinValue/2);
        byte myNewByteValue= (byte) (myIntMinValue/2);
        short myNewShortValue=(short)(myIntMaxValue/2);

        //Challenge

        byte myByte= 10;
        short myShort=20;
        int myInt=50;
        long myLong=50_000L+(10*(myByte+myShort+myInt));
        System.out.println("myLong = "+myLong);

    }
}
