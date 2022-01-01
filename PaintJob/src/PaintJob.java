public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        if (width * height % areaPerBucket == 0) {
            return (int) ((width * height) / areaPerBucket) - extraBuckets;
        } else {
            return (int) ((width * height) / areaPerBucket) - extraBuckets + 1;
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        if (width * height % areaPerBucket == 0) {
            return (int) ((width * height) / areaPerBucket);
        } else {
            return (int) ((width * height) / areaPerBucket) + 1;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        if (area % areaPerBucket == 0) {
            return (int) (area / areaPerBucket);
        } else {
            return (int) (area / areaPerBucket) + 1;
        }
    }
}
