import java.util.Scanner;

public class Triangle {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first cathetus");
        double firstCathetus = sc.nextInt();
        System.out.println("Enter the second cathetus");
        double secondCathetus = sc.nextInt();
        double thirdCathetus = Math.sqrt(Math.pow(firstCathetus, 2) + Math.pow(secondCathetus, 2));
        double square = (firstCathetus * secondCathetus)/2;
        double perimeter = (firstCathetus + secondCathetus + thirdCathetus);
        System.out.println("The square of triangle is " + square);
        System.out.println("The perimeter of triangle is " + perimeter);
    }
}
