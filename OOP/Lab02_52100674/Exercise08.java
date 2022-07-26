import java.math.BigDecimal;

public class Exercise08 {
    public static BigDecimal findMax(BigDecimal []arr){
        BigDecimal max=arr[0];
        for(BigDecimal n: arr){
            if(max.compareTo(n)<0){
                max=n;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        BigDecimal[] arr={
            new BigDecimal(10),
            new BigDecimal(15),
            new BigDecimal(-10),
        };
        System.out.println(findMax(arr));
    }
}