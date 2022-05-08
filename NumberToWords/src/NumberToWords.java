public class NumberToWords {
    public static int reverse(int number){

        boolean negativeFlag=false;
        if(number<0){
            negativeFlag=true;
            number*=-1;
        }

        int result=0;
        while(number!=0){
            result*=10;
            result+=number%10;
            number/=10;
        }
        if(negativeFlag)result*=-1;

        return result;
    }

    public static int getDigitCount(int number){
        if(number<0) return -1;

        int digitCount=0;

        do{
            digitCount++;
            number/=10;
        }while(number!=0);

        return digitCount;

    }

    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
            return;
        }
        int digitCount=getDigitCount(number);
        number=reverse(number);
        int frontZerosCount=digitCount-getDigitCount(number);

        String result="";

        do{
            int digit=number%10;
            number/=10;

            switch (digit){
                case 0:
                    result+="Zero ";
                    break;
                case 1:
                    result+="One ";
                    break;
                case 2:
                    result+="Two ";
                    break;
                case 3:
                    result+="Three ";
                    break;
                case 4:
                    result+="Four ";
                    break;
                case 5:
                    result+="Five ";
                    break;
                case 6:
                    result+="Six ";
                    break;
                case 7:
                    result+="Seven ";
                    break;
                case 8:
                    result+="Eight ";
                    break;
                case 9:
                    result+="Nine ";
                    break;
                default:
                    break;
            }
        }while(number!=0);

        for(int i=0;i<frontZerosCount;i++){
            result+="Zero ";
        }

        System.out.println(result);
    }
}
