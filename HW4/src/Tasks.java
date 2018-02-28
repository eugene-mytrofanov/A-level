import java.util.Scanner;

public class Tasks {

    public static void firstTask() {

        System.out.println("Enter the integer number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        while (n != 0) {
            sum += n % 10; // sum = sum + n % 10
            n /= 10;  //n = n / 10;
        }
        System.out.println("The sum of all digits is " + sum);
    }

    public static void secondTask() {
        int previous = 0;
        int current = 1;
        int next,i;
        System.out.print(previous + " " + current + " ");

        for (i = 0; i < 9; i++){
            next =  current + previous;
            System.out.print(next + " ");
            previous = current;
            current = next;
        }
    }
}
