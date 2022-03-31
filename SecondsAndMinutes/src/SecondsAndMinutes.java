public class SecondsAndMinutes {
    public static String  getDurationString(int minutes,int seconds){
        if(minutes<0||seconds<0||seconds>59) return "Invalid value";

        int hours=minutes/60;
        minutes=minutes%60;

        String HH=String.format("%02d",hours);
        String MM=String.format("%02d",minutes);
        String SS=String.format("%02d",seconds);

        String result=HH+"h "+MM+"m "+SS+"s";
        return result;
    }

    public static String  getDurationString(int seconds){
        if(seconds<0) return "Invalid value";
        int minutes=seconds/60;
        seconds=seconds%60;
        return getDurationString(minutes,seconds);
    }
}
