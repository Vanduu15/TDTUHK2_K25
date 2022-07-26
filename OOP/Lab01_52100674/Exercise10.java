public class Exercise10{
public static int sumFirstAndLastDigit(int number) {
    if (number < 0) {
        return -1;
    }

    int last = number % 10;
    int first = number;
    
    while (first >= 10) {
        first = first / 10;
    }

    return first + last;
}}
public static void main(String arg[]){
	sumFirstAndLastDigit(10)
}