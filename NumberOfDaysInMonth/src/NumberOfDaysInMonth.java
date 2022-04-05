public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                } else return false;
            }else return true;
        }else return false;

    }

    public static int getDaysInMonth(int month, int year){
        if(month<1||month>12) return -1;
        if(year<1||year>9999) return -1;
        if(isLeapYear(year)&&month==2) return 29;
        int result;
        switch (month){
            case 1:
                result=31;
                break;
            case 2:
                result=28;
                break;
            case 3:
                result=31;
                break;
            case 4:
                result=30;
                break;
            case 5:
                result=31;
                break;
            case 6:
                result=30;
                break;
            case 7:
                result=31;
                break;
            case 8:
                result=31;
                break;
            case 9:
                result=30;
                break;
            case 10:
                result=31;
                break;
            case 11:
                result=30;
                break;
            case 12:
                result=31;
                break;
            default:
                result=-1;
                break;
        }
        return result;
    }
}
