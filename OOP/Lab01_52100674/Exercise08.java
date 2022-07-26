import java.util.Scanner;
public class Exercises08 {
    public static int A(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            s=s+i;
        }
        return s;
    }
    
    public static int B(int n){
        int p=1;
        for(int i=1;i<=n;i++){
            p=p*i;
        }
        return p;
    }
    public static int C(int n){
        int s=0;
        for(int i=0;i<=n;i++){
            s=(int) (s+Math.pow(2,i));
        }
        return s;
    }
    public static double D(int n){
        double s=0;
        for(int i=1;i<=n;i++){
            s=s+1.0/(2*i);
        }
        return s;
    }
    public static int E(int n){
        int s=0;
        for(int i=0;i<=n;i++){
            s=s+(int)Math.pow(i,2);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Nhap N:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("S="+A(n));
        System.out.println("P="+B(n));
        System.out.println("S="+C(n));
        System.out.println("S="+D(n));
        System.out.println("E="+E(n));


    }
}
