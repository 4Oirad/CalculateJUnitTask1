import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        System.out.println("Введите радиус окружности в сантиметрах: ");
        Scanner scanner = new Scanner(System.in);
        int сircleRadius = scanner.nextInt();
        System.out.println("Площадь круга: " + circleArea(сircleRadius) + " см.кв.");
        System.out.println("Длина окружности: " + circleLength(сircleRadius) + " см.");
    }

    public static double circleArea(int circleRadius) {
        double circleArea = 3.14*circleRadius*circleRadius;
        return circleArea;
    }

    public static double circleLength(int сircleRadius) {
        double circleLength = 2*3.14*сircleRadius;
        return circleLength;
    }
}