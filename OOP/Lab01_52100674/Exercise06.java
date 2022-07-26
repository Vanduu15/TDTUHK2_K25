import java.util.Scanner;
public class Exercise06 {
    public static int findMin(int a,int b,int c){
        int min;
        if(a<b & a<c){
            min=a;
        }
        else if(b<c & b<a){
            min=b;
        }
        else{
            min=c;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dau tien:");
        int a=sc.nextInt();
        System.out.println("Nhap so thu hai:");
        int b= sc.nextInt();
        System.out.println("Nhap so thư 3:");
        int c= sc.nextInt();
        System.out.println("So nho nhat la:"+findMin(a,b,c));
    }
}
