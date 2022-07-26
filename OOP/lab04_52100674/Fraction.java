public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {}

    public Fraction(int num,int den) {
        this.numerator = num;
        this.denominator = den;
    }

    public Fraction( Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f) {
        Fraction result = new Fraction();

        result.numerator = this.numerator*f.denominator + f.numerator*this.denominator;
        result.denominator = this.denominator*f.denominator;

        
        return result;
    }

    public Fraction sub(Fraction f) {  
        Fraction result = new Fraction();

        result.numerator = this.numerator*f.denominator - f.numerator*this.denominator;
        result.denominator = this.denominator*f.denominator;

        
        return result;
    }
    public Fraction mul(Fraction f) { 
        Fraction result = new Fraction();

        result.numerator = this.numerator*f.numerator;
        result.denominator = this.denominator*f.denominator;

        
        return result;
    }
    public Fraction div(Fraction f) {
        Fraction result = new Fraction();

        result.numerator = this.numerator*f.denominator;
        result.denominator = this.denominator*f.numerator;

        
        return result;
    }
    public void reducer() {
        int uc=1;
        for(int i=1;i<this.denominator && i<this.numerator;i++){
            if(this.denominator%i==0 && this.numerator%i==0){
                uc=i;
            }

        }
        this.numerator=this.numerator / uc;
        this.denominator=this.denominator/ uc;
    }

    public String toString() {
        return "Fraction[ Num = " + this.numerator +","+"mauSo = " + this.denominator + "]";
    }

}
