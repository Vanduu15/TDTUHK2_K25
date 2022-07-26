import java.lang.String;

class Exercise02{
    public static String shortName(String str){
        String[] parts = str.split(" ");
        return parts[parts.length-1] + " " + parts[0];
    }

    public static String hashtagName(String str){
        String[] parts = str.split(" ");
        return "#" + parts[parts.length-1] + parts[0];
    }

    public static String upperCaseAllVowel(String str){
        char[] parts = str.toCharArray();

        for(int i = 0; i < parts.length; i++){
            if ( parts[i] == 'u' || parts[i] == 'e' || parts[i] == 'o' || parts[i] == 'a'|| parts[i] == 'i')
                parts[i]= Character.toUpperCase(parts[i]);
        }
        
        str = String.valueOf(parts);
        return str;
    }
    // toUpperCase(String str)

    public static String upperCaseAllN(String str){
        str = str.toLowerCase();

        char[] parts = str.toCharArray();

        for( int i=0; i< parts.length; i++){
            if ( parts[i] == 'n'){
                parts[i] = Character.toUpperCase(parts[i]);
            }
        }

        str = String.valueOf(parts);
        return str;
    }

    public static void main(String[] args){
        String str = "Tran Thi Ven";

        System.out.println(shortName(str));
        System.out.println(hashtagName(str));
        System.out.println(upperCaseAllVowel(str));
        System.out.println(upperCaseAllN(str));
    }
}