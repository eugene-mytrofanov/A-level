import java.util.Scanner;

public class OddOrEven {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, please");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Hey man, it's a zero!");
        } else if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
