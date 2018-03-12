import java.util.Scanner;

public class GuessNumber {

    public static int enterMyNumber(){
        System.out.println("Введите ваше число");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите максимальное возможное число");
        int n = sc.nextInt();

        System.out.println("Введите число попыток");
        int k = sc.nextInt();

        double randomNumber = Math.random() * n + 1; // random number is between 0 and (almost) 1
        randomNumber = (int) randomNumber; // cast to integer (ignore decimal part)

        int myNumber = enterMyNumber();

        //System.out.println("Компьютер загадал число " + randomNumber);
        //System.out.println("Вы ввели число " + myNumber);

        while (k != 0) {
            if (randomNumber == myNumber) {
                System.out.println("Вы угадали, загаданное число " + randomNumber);
                k = 0;
            } else if (randomNumber < myNumber) {
                k--;
                System.out.println("Загаданное число меньше, осталось " + k + " попыток");
                if (k > 0) myNumber = enterMyNumber();
            } else {
                k--;
                System.out.println("Загаданное число больше, осталось " + k + " попыток");
                if (k > 0) myNumber = enterMyNumber();
            }
        }
        System.out.println("Game over");
    }
}