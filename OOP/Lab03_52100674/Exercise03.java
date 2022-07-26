import java.util.Scanner;

public class Exercise03 {
	public static String getFirstAndLastName(String s) {
        String[] name = s.split(" ");
        String name1 = "";
        name1 = name[0] + " " + name[name.length - 1];
        return name1;
    }

    public static String getMiddleName(String s) {
        String[] name = s.split(" ");
        String name1 = "";
        for (int i = 1; i < name.length - 1; i++) {
            name1 = name[i] + " ";
        }

        return name1;
    }

    public static void upperName(String fullName) {
        String s = fullName.toLowerCase();
        String[] name = s.split(" ");
        String name1 = "";
        for (int i = 0; i < name.length; i++) {

            name1 = name[i].substring(0, 1).toUpperCase() + name[i].substring(1, name[i].length()) + " ";
            System.out.print(name1);
        }
    }

    public static String upperVowelAndLowerConsonant(String fullName) {
        String name = fullName.toLowerCase();
        char[] s = name.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'o' || s[i] == 'u' || s[i] == 'i') {
                s[i] -= 32;
            }
        }
        String name1 = String.valueOf(s);
        return name1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        System.out.println("a) " + getFirstAndLastName(fullName));
        System.out.println("b) " + getMiddleName(fullName));
        System.out.print("c) ");
        upperName(fullName);
        System.out.println();
        System.out.println("d) " + upperVowelAndLowerConsonant(fullName));
        sc.close();
    }
}