public class Exercise07 {
    public static void square(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={4, 3, 20, 9, 10, 11, 1};
        square(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
