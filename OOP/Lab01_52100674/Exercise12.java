public class Exercise12 {
    public static int reverseNumber(int n) {
       int reverse = 0;
       int m=n;
        while (n>0)
        {
            reverse= reverse*10+ n%10;
            n/=10;
        }
        System.out.printf("Reverse of %d is %d " ,m, reverse);

    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(123));

    }
}
