public class Exercise02 {
	public static void addMatrix(int[][] arr1, int[][] arr2) {
        int[][] arr = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void multiplyMatrix(int[][] arr1, int k) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] *= k;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void printMatrixToScreen(int[][] arr2) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void runAll(int[][] arr1, int[][] arr2, int k) {
        addMatrix(arr1, arr2);
        System.out.println();
        multiplyMatrix(arr1, k);
        System.out.println();
        printMatrixToScreen(arr2);
    }

    public static void main(String[] args) {
        int[][] arr1 = { { 15,7,3 }, { 2,0,4} };
        int[][] arr2 = { { 14,02,19 }, { 14,02,22 } };
        System.out.println("a)");
        addMatrix(arr1, arr2);
        System.out.println("b)");
        multiplyMatrix(arr1, 3);
        System.out.println("c)");
        printMatrixToScreen(arr2);
        System.out.println("d)");
        runAll(arr1, arr2, 2);
    }

}