public class Exercise11 {
    public static int countDigitOfNumber(int n) {
        int count = 0, a;
        int m = n;
        do {
            a = n % 10;
            count++;
            n = (n-a)/10;
        } while (n!=0);
        System.out.printf("Number of  digit of %d is " , m);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigitOfNumber(123456789));

    }
}
