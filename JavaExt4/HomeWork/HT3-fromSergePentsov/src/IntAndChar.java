public class IntAndChar {
    public int A;
    public char B;

    public void print() {
        System.out.println("The non-initialized value of int A is " + A);
        System.out.println("The non-initialized value of char B is " + B);
        System.out.println('\u0000');
    }
}
