import java.util.HashMap;
import java.util.Scanner;

public class Exercise02{
    public static boolean check(HashMap<String, String> map, String key){
        if(map.containsKey(key)){
            return true;
        }
        return false;
    }
    public static String getValue(HashMap<String, String> map,String s){
        return map.get(s);
    }
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("hoc do","that bai");
        map.put("hoc ngu","rot mon");
        map.put("lao ngao","dong tien hoc lai");
        map.put("vang","truot");
        map.put("di tre","giam thi hot");
        map.put("mat the sv","dung the tam");
        map.put("thang may dong","tre hoc");
        map.put("ao the duc","giam thi bat");
        map.put("long nhong","FO");
        map.put("cuoi ki","trum men");
        System.out.println("Enter word:");
        String s=new Scanner(System.in).nextLine();        
        if(check(map,s)){
            System.out.println("Word "+s+" has meaning: "+getValue(map,s));
        }
        else{
            System.out.println("Word "+s+" doesn't exist in dictionary");
        }
    }
}