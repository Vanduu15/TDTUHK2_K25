import java.util.Scanner;

class Exercise01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n elements: ");
        int n = sc.nextInt();

        int a[] = {-5,-2,-1,1,4,5,6,7,10};

        System.out.println("MaxEven: " + maxEven(a));
        System.out.println("minOdd: " + minOdd(a));
        System.out.println("sumMEMO: " + sumMEMO(a));
        System.out.println("sumEven: " + sumEven(a));
        System.out.println("prodOdd: " + prodOdd(a));

        int b = idxFirstEven(a);
        if ( b == -1 )
            System.out.println("Array hasn't even number");
        else
            System.out.println("First Index is Even Number: " + b);

        b = idxLastOdd(a);
        if ( b == -1 )
            System.out.println("Array hasn't Odd Number");
        else
            System.out.println("Last Index is Odd Number: " + b);

        System.out.println("int[n]: ");
        for ( int x : input(n)){
            System.out.println(x);
        }
    }

    public static int idxLastOdd(int[] a){
        for(int i = a.length - 1 ; i >= 0; i--){
            if ( a[i] % 2 != 0 )
                return i;
        }
        return -1;
    }

    public static int idxFirstEven(int[] a){
        for(int i = 0; i < a.length; i++){
            if ( a[i] % 2 == 0 )
                return i;
        }
        return -1;
    }

    public static int[] input(int n){
        return new int[n];
    }

    public static int prodOdd(int[] a){
        int product = 0;
        int dem = 0;

        for(int i = 0; i < a.length; i++){
            if ( a[i] % 2 != 0 ){
                product = a[i];
                break;
            }

            if (i == a.length - 1)
                return 0;
        }

        for(int i = 0; i < a.length; i++){
            if ( a[i] % 2 != 0 ){
                product *= a[i];
            }
        }
        return product;
    }

    public static int sumEven(int[] a){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            if ( a[i] % 2 == 0){
                sum = sum + a[i];
            }
        }
        return sum;
    }

    public static int sumMEMO(int[] a){
        int temp1 = 0;
        for(int i=0; i<a.length; i++){
            if ( a[i] % 2 == 0 && a[i] > temp1){
                temp1 = a[i];
            }
        }

        int temp2 = 0;
        for(int i=0; i<a.length; i++){
            if ( a[i] % 2 != 0 && a[i] < temp2){
                temp2 = a[i];
            }
        }
        return temp1 + temp2;
    }

    public static int minOdd(int[] a){
        int temp = 0;
        for(int i=0; i<a.length; i++){
            if ( a[i] % 2 != 0 && a[i] < temp){
                temp = a[i];
            }
        }
        return temp;
    }

    public static int maxEven(int[] a){
        int temp = 0;
        for(int i=0; i<a.length; i++){
            if ( a[i] % 2 == 0 && a[i] > temp){
                temp = a[i];
            }
        }
        return temp;
    }


}