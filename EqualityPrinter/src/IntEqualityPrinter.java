public class IntEqualityPrinter {
    public static void printEqual(int first,int second,int third){
        if(first<0||second<0||third<0) {
            System.out.println("Invalid Value");
            return;
        }
        else if(first==second&&second==third){
            System.out.println("All numbers are equal");
            return;
        }
        else if(first!=second&&second!=third&&first!=third){
            System.out.println("All numbers are different");
            return;
        }
        else{
            System.out.println("Neither all are equal or different");
        }

    }
}
