public class LuckyNumber {
    public static void main(){
    int q = 0;
    int i, j; // i = first three digits, j = second three digits
    for (i = 1; i < 1000; i++) {
        for (j = 1; j < 1000; j++) {
            if (sum(i) == sum(j)) q++;
        }
    }
    System.out.println("The total quantity of lucky tickets is " + q);
}
    public static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10; // sum = sum + n % 10
            n /= 10;  //n = n / 10;
        }
        return sum;
    }
}
