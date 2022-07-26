public class Exercise05 {
    public static boolean new_equal(String s1, String s2) {
        return s1.equals(s2);
    }
    public static void countWord(String paragraph) {
        String str = paragraph.toLowerCase();
        String[] s = str.split("\\s");
        for (int i = 0; i < s.length; i++) {

            System.out.println(s[i]);

        }
        int count = 0;
        int[] counter = new int[s.length];

        for (int i = 0; i < s.length - 1; i++) {
            count = 1;
            for (int j = i + 1; j < s.length; j++) {
                if (new_equal(s[i], s[j])) {
                    count++;
                    s[j] = "";
                }
            }
            counter[i] = count;
        }
    }

    public static void main(String[] args) {
        String paragraph = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.";
        countWord(paragraph);

    }
}
