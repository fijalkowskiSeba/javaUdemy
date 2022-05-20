public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10) return -1;
        if(second<10) return -1;



       while (first!=second){
           if(first>second) first-=second;
           else second-=first;
       }

       return first;
    }
}
