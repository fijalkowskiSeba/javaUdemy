package pl.sebastianf;

public class Main {

    public static void main(String[] args) {
	    String myString="This is my string";
        System.out.println(myString);
        myString += " lol";
        System.out.println(myString);
        myString=myString+" \u00A9 2019";
        System.out.println(myString);
        String numberString="250.55";
        numberString+=" 49.95";
        System.out.println(numberString);
        String lastString ="10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println("LastString is equal to "+lastString);
        double doubleNumber=120.47d;
        lastString=lastString+doubleNumber;
        System.out.println("LastString is equal to "+ lastString);

    }
}
