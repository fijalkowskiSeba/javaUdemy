public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0) return false;
        if(smallCount<0) return false;
        if (goal<0) return false;

        while(goal>=5&&bigCount>0){
            goal-=5;
            bigCount--;
        }
        while(goal>0&&smallCount>0){
            goal--;
            smallCount--;
        }
        if(goal>0) return false;
        else return true;
    }
}
