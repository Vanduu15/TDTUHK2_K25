public class Exercise09 {
    public static void main(String[] args) {
        int[] arr ={4, 3, 20, 9, 10, 11, 1};
        int k=2;
        for(int i=0;i<Myclass.divisibleNumbers(arr, k).length;i++){
            System.out.println(Myclass.divisibleNumbers(arr, k)[i]);
        }
    }
}
