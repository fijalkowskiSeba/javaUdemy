package pl.sebastianf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float floatMaxValue=Float.MAX_VALUE;
        float floatMinValue=Float.MIN_VALUE;
        System.out.println("Float min value: "+floatMinValue);
        System.out.println("Float max value: "+floatMaxValue);

        double doubleMaxValue=Double.MAX_VALUE;
        double doubleMinValue=Double.MIN_VALUE;
        System.out.println("Double min value: "+doubleMinValue);
        System.out.println("Double max value: "+doubleMaxValue);

        int myIntValue=5/3;
        float myFloatValue=5f/3f;
        double myDoubleValue=5.00/3.00;
        System.out.println("MyIntValue= "+myIntValue);
        System.out.println("MyFloatValue= "+myFloatValue);
        System.out.println("MyDoubleValue= "+myDoubleValue);


        Scanner scanner=new Scanner(System.in);
        double numberOfPounds=scanner.nextDouble();
        double numberOfKilograms=numberOfPounds*0.45359237;
        System.out.println(numberOfPounds+" pounds = "+numberOfKilograms+" kilograms");



    }
}
