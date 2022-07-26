import java.util.Scanner;

public class Exercise04 {
	public static int lenOfString(String s) {
        String[] str = s.split(" ");
        return s.length() + str.length - 1;
    }

    public static int countWord(String s) {
        String[] str = s.split(" ");
        return str.length;
    }

    public static String concatenateString(String s, String str) {
        s += " ";
        return s.concat(str);
    }

    public static boolean palindrome(String s) {
        int test = 0;
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == s1[s1.length - i - 1]) {
                test += 1;
            } else {
                test = 0;
                break;
            }
        }
        if (test != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("a) " + lenOfString(s));
        System.out.println("b) " + countWord(s));
        System.out.println("c) ");
        String str = sc.nextLine();
        System.out.println(concatenateString(s, str));
        System.out.println("d) " + palindrome(s));
        sc.close();
    }
}
