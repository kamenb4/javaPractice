
public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return Math.abs((float) 4.0 / 3.0 * Math.PI * Math.pow(radius, 3.0));
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double formula = (p * (p - a) * (p - b) * (p - c));
        double square = Math.sqrt(formula);
        if(formula <= 0 || !isTrianglePossible(a, b, c)){
            return -1.0;
        }
        return square;
    }
}
