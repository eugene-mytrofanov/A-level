import java.util.Scanner;

public class QuadraticEquationRoots {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 'a' number");
        double a = sc.nextDouble();
        System.out.println("Enter the 'b' number");
        double b = sc.nextDouble();
        System.out.println("Enter the 'c' number");
        double c = sc.nextDouble();
        double discriminant = (b * b) - (4 * a * c);
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant))/(2*a);
            double x2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("First root is " + x1 + " Second root is " + x2);
        } else if (discriminant == 0)  {
            double x1 = (-b / 2*a);
            System.out.println("The root is " + x1);
        } else {
            System.out.println("No roots are found");
        }
    }
}
