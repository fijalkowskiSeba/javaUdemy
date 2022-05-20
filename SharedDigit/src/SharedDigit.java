public class SharedDigit {

    public static boolean hasSharedDigit(int first,int second){
        if(first<10||first>99) return false;
        if(second<10||second>99) return false;


        while(first>0){
            int digitOne=first%10;
            first/=10;
            int secondCopy=second;
            while(secondCopy>0){
                if(secondCopy%10==digitOne) return true;
                secondCopy/=10;
            }
        }
        return false;
    }
}
