public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) return -1d;

        final double PI = Math.PI;
        double result = radius * radius * PI;

        return result;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) return -1d;
        double result = x * y;
        return result;
    }
}
