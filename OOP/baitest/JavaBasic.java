public class JavaBasic{
    public static int sumNegativeElements(int a[]){
        //sinh vien code tai day
        int sum =0;
        for(int i : a){
            if(i<0){
                sum+=i;
            }
        }
        return sum;
    }

    public static String uppercaseFirstVowels(String str){
        //sinh vien code tai day
        String[] words = str.split(" ");
        
    }
    
    public static int findMinNegativeElement(int a[]){
        int min=0, indx=0;
        for(int i = 0, i<a.length , i++){
            if(a[i]<0 && a[i]<min){
                min = a[i];
                indx=i;
            }
        }
        return min ==0? -1: indx;
        //sinh vien code tai day
    }
    
    public static String getName(String str){
        //sinh vien code tai day
        return str.split(" ")[1];
    }

    public static int findFirstMod3Element(int[] a){
        for(int i=0, i< a.length;i++){
            if( a[i] % 3 == 0){
                return i;
            }
        }
        return -1;
        //sinh vien code tai day
    }

    public static int countString(String str, String k){

        //sinh vien code tai day
    }

    public static void main(String[] args){
        int a = {1,-2,3,4,-2,1,-9};
        //sinh vien code tai day
        String s = "nguyen thi uyen an";
        //sinh vien code tai day
        String s1 = "Ho ten: Nguyen Thi Anh Dao";
        //sinh vien code tai day
        String s2 = "Nguyen Phuong Hoang Anh Phuong Oanh";
        //sinh vien code tai day
    }

}