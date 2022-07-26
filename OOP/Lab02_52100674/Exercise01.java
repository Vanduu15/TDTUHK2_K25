public class Exercise01 {
    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 20, 9, 10, 11, 1 };
        System.out.println(findMax(arr));
    }
}