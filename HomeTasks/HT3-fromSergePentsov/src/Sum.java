import java.util.Scanner;

public class Sum {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two digits number, please");
        int n = sc.nextInt();
        if (n >= 10 && n <= 99) {
            int sum;
            int n2 = n % 10;
            int n1 = (n / 10) % 10;
            System.out.println("The sum is " + (n1 + n2));
        } else {
            System.out.println("Number is not two digits!");
            run();
        }
    }
}