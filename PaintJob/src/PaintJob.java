public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(extraBuckets<0) return -1;
        if(width<=0) return -1;
        if(height<=0) return -1;
        if(areaPerBucket<=0) return -1;


        double areaToPaint=width*height;
        double neededBuckets=areaToPaint/areaPerBucket;
        neededBuckets-=extraBuckets;
        if(neededBuckets<0) return 0;
        else{
            return (int)(neededBuckets+1);
        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        //if(extraBuckets<0) return -1;
        if(width<=0) return -1;
        if(height<=0) return -1;
        if(areaPerBucket<=0) return -1;


        double areaToPaint=width*height;
        double neededBuckets=areaToPaint/areaPerBucket;
        if(neededBuckets<0) return 0;
        else{
            return (int)(neededBuckets+1);
        }

    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0) return -1;
        if(areaPerBucket<=0) return -1;



        double neededBuckets=area/areaPerBucket;
        //neededBuckets-=extraBuckets;
        if(neededBuckets<0) return 0;
        else{
            return (int)(neededBuckets+1);
        }

    }

}
