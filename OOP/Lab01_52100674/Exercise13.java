public class Excercise13{
public static boolean checkPalindrome(int n)
       int r,s=0;
       int temp=n;    
       while(n>0)
       {    
       r=n%10;    
       s=(s*10)+r;    
       n=n/10;    
       }    
       return s == n? true: false;
  }  
  public static void main(String arg[]){
	system.out.println(checkPalindrome(1234));
} 
