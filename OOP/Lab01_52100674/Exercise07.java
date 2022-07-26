import java.util.Scanner;
public class  Exercise07{
    public static boolean checkAlphanumeric(String a){
        if( (a.codePointAt(0) <=90 & a.codePointAt(0)>=65) | (a.codePointAt(0)<=122 & a.codePointAt(0)>=97) | (a.codePointAt(0) <=57 & a.codePointAt(0)>=48) ){
            return true;
        }
        else{
           return false; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chu cai can kiem tra:");
        String a = sc.nextLine();
        if(checkAlphanumeric(a)){
            System.out.println("Day la chu hoac so");
        }
        else{
            System.out.println("Day la khong la chu hoac so");
        }

    }

}