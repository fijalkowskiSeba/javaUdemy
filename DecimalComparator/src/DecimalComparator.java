public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first,double second){
        if(((int)(first*1000))==((int)(second*1000))) return true;
        else return false;
    }
}
