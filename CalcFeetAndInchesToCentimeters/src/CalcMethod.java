public class CalcMethod {

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet<0) return -1;
        if(inches<0||inches>12) return -1;

        final  double inchesToCentimeters=2.54;
        final int footToInches=12;
        double result=0;
        result+=inches*inchesToCentimeters;
        result+=feet*footToInches*inchesToCentimeters;
        return result;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0) return -1;
        final int footToInches=12;
        double feet=inches/footToInches;
        return calcFeetAndInchesToCentimeters(feet,0);
    }
}
