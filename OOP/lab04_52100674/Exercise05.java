public class Exercise05 {
    public static void main(String[] args) {
        Fraction a =new Fraction(4,8);
        Fraction b=new Fraction(a);
        System.out.println(a.add(b));
        System.out.println(a.sub(b));
        System.out.println(a.mul(b));
        System.out.println(a.div(b));
        a.reducer();
        System.out.println(a);
    }
}
