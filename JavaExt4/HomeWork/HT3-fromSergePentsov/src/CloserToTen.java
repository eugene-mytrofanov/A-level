import java.util.Scanner;

public class CloserToTen {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m number");
        double m = sc.nextDouble();
        System.out.println("Enter the n number");
        double n = sc.nextDouble();

        if (Math.abs(m - 10) < Math.abs(n - 10)) {
            System.out.println(m + " is closer to 10");
        } else if (Math.abs(m - 10) > Math.abs(n - 10)) {
            System.out.println(n + " is closer to 10");
        } else {
            System.out.println(m + " and " + n + " are equally close to 10");
        }

    }
}
