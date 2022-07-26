public class Myclass {
    public int findMin(int arr[]){
        int min=arr[0];
        for(int n: arr){
            if(min>n){
                min=n;
            }
        }
        return min;
    }
    public int sumEven(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public int CountElement(int arr[],int k){
        int counte=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                counte++;
            }
        }
        return counte;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int CountPrime(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                count++;
            }
        }
        return count;

    }
    public static int[] divisibleNumbers(int arr[],int k){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%k==0){
                j++;
            }
        }
        int[] a=new int[j];
        int b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%k==0){
                a[b]=arr[i];
                b++;
            }
        }

        return a;
    }
    public int findThirdlargest(int[] arr){
        int max1=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max1<arr[i]){
                max1=arr[i];
            }
        }
        int max2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max2<arr[i] & arr[i]<max1){
                max2=arr[i];
            }

        }
        int max3=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max3<arr[i] & arr[i]<max1 &arr[i]<max2){
                max3=arr[i];
            }
        }
        return max3;
    }

}
