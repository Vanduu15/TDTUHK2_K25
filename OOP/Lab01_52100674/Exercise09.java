public class Exercise09{
public static int main(int number) {
    if (number < 0) {
        return -1;
    }

    int last = number % 10;
    int first = number;
    
    while (first >= 10) {
        first = first / 10;
    }

    return first + last;
}
}