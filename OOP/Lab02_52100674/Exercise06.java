public class Exercise06 {
	public static int find(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }
}

public static void main(String[] args) {
        int[] arr = { 4, 3, 20, 9, 10, 11, 1 };
        System.out.println(find(arr),9);
    }