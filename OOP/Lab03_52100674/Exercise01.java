public class Exercise01 {
    public static boolean removeFirst(int[] arr, int n) {
        int a = arr.length;
        for (int i = 0; i < a;) {
            if (arr[i] == n) {
                for (int j = i; j <= a - 2; j++) {
                    arr[j] = arr[j + 1];
                }
                a--;
                return true;
            } else {
                i++;
            }
		}
        return false;
    }

    public static void insertElement(int[] arr, int n, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (i == n) {
                for (int j = arr.length - 1; j >= i; j--) {
                    arr[j] = arr[j - 1];

                }
                arr[i] = a;

            }
        }
        for (int f = 0; f < arr.length - 1; f++) {
            System.out.printf("%d ", arr[f]);
        }
	}

    public static boolean notIn(int[] a, int n) {
        for (int x : a) {
            if (x == n) {
                return false;
            }
        }
        return true;
    }

    public static void findDuplicate(int[] arr) {

        int[] temp = new int[arr.length];
        int count = 0;
        int[] counter = new int[arr.length];
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            counter[i] = count;
		}

        for (int i = 0; i < arr.length; i++) {
            if (counter[i] > 1 && notIn(temp, arr[i])) {
                temp[i] = arr[i];
            }
        }

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (temp[i] != 0) {
                arrNew[j] = temp[i];
                j++;
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.print(arrNew[i] + " ");
        }
	}
    public static void removeduplicates(int[] arr) {

        int n = arr.length;

        if (n == 0 || n == 1) {
            System.out.println(arr[0]);
        }

        int[] temp = new int[arr.length];
        int count = 0;
        int[] counter = new int[arr.length];
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            counter[i] = count;

        }

        for (int i = 0; i < arr.length; i++) {
            if (counter[i] > 0 && notIn(temp, arr[i])) {
                temp[i] = arr[i];
            }
        }

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (temp[i] != 0) {
                arrNew[j] = temp[i];
                j++;
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.print(arrNew[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 15,2,20,20,3,2,7,20,0};

        System.out.println(removeFirst(arr, 10));
        insertElement(arr, 2, 10);
        System.out.println();
        findDuplicate(arr);
        System.out.println();
        removeduplicates(arr);

    }
}