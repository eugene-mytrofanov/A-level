import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        /* Task 1 : Создать класс, который содержит int и char (не проинициализированные) и распечатать их
        значения. */
//        IntAndChar o = new IntAndChar();
//        o.print();

        /* Task 2 : Создать класс Dog, который будет содержать 2 поля name и says. В main( ) создать 2
        экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”). И распечатать поля
        объектов. */
//        Dog o1 = new Dog();
//        o1.name = "spot";
//        o1.says = "Ruff!";
//        Dog o2 = new Dog();
//        o2.name = "scruffy";
//        o2.says = "Wurf!";
//
//        o1.print();
//        o2.print();

        /* Task 3 : Создать программу, проверяющую и сообщающую на экран, является ли целое число,
        записанное в переменную n, чётным либо нечётным (n – вводит пользователь). */
//        OddOrEven.run();

        /* Task 4 : В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую
        и выводящую на экран сумму цифр числа n (n – вводит пользователь). */
//        Sum.run();

        /* Task 5 : Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в
        переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m – вводит пользователь). */
//        CloserToTen.run();

        /* Task 6 : В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
        Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит пользователь). */
//        Triangle.run();

        /* Task 7 : В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
        будет находить и выводить на экран вещественные корни квадратного уравнения
        ax^2+bx+c=0, либо сообщать, что корней нет (a, b и c – вводит пользователь). */
//        QuadraticEquationRoots.run();

        /* Task 8 : Создать класс, который будет хранить в одной целочисленной переменной несколько значений меньшей длины.
        Например, возраст, вес, рост и год рождения. Добавить методы получения и добавления параметров отдельно. */

        OneInteger human = new OneInteger();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the human");
        human.setAge(sc.nextInt());

        System.out.println("Enter the weight of the human");
        human.setWeight(sc.nextInt());

        System.out.println("Enter the height of the human");
        human.setHeight(sc.nextInt());

        System.out.println("Enter the year of birth of the human");
        human.setYearOfBirth(sc.nextInt());

        human.getAge();
        human.getWeight();
        human.getHeight();
        human.getYearOfBirth();
   }
}
