
public class Fraction {
    private int numerator;
    private int denominator;

    public  Fraction(){
    }

    public Fraction(int a, int b) {
        this.numerator = a;
        this.denominator = b;
    }

    public Fraction(Fraction source) {
        this.numerator = source.numerator;
        this.denominator = source.denominator;
    }

    public void setNumerator(int n) {
        this.numerator = n;
    }

    public void setDenominator(int d) {

        this.denominator = d;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void Print() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public static Fraction Add(Fraction f1, Fraction f2) {
        int LCD = lcd(f1.getDenominator() , f2.getDenominator());

        Fraction f = new Fraction();
        f.setNumerator(f1.getNumerator() * f2.getDenominator()
                + f2.getNumerator() * f1.getDenominator());
        f.setDenominator(LCD);
        return f.reduce();
    }

    public static Fraction Subtraction(Fraction f1, Fraction f2) {
        int LCD = f1.getDenominator() * f2.getDenominator();

        Fraction f = new Fraction();
        f.setNumerator(f1.getNumerator() * f2.getDenominator()
                - f2.getNumerator() * f1.getDenominator());
        f.setDenominator(LCD);
        return f.reduce();
    }

    public static Fraction Multiply(Fraction f1, Fraction f2) {
        int LCD = f1.getDenominator() * f2.getDenominator();

        Fraction f = new Fraction();
        f.setNumerator(f1.getNumerator() *f2.getNumerator());
        f.setDenominator(LCD);
        return f.reduce();
    }

    public static Fraction Division(Fraction f1, Fraction f2) {
        int LCD = f1.getDenominator() * f2.getNumerator();

        Fraction f = new Fraction();
        f.setNumerator(f1.getNumerator() *f2.getDenominator());
        f.setDenominator(LCD);
        return f.reduce();
    }

    public static int lcd(int denom1, int denom2)
    {
        int factor = denom1;
        while ((denom1 % denom2) != 0)
            denom1 += factor;
        return denom1;
    }

    private int gcd(int denom1, int denom2)
    {
        int factor = denom2;
        while (denom2 != 0) {
            factor = denom2;
            denom2 = denom1 % denom2;
            denom1 = factor;
        }
        return denom1;
    }


    private Fraction reduce()
    {
        Fraction result = new Fraction();
        int common = 0;
        int num = Math.abs(numerator);
        int den = Math.abs(denominator);
        if (num > den)
            common = gcd(num, den);
        else if (num < den)
            common = gcd(den, num);
        else
            common = num;
        result.numerator = numerator / common;
        result.denominator = denominator / common;
        return result;
    }
    
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,4);
        Fraction f2 = new Fraction(4,6);

        Fraction result = Add(f1,f2);
        System.out.println("Fraction 1:");
        f1.Print();
        System.out.println("Fraction 2:");
        f2.Print();
        System.out.println("Addition of two fractions:");
        result.Print();
        System.out.println("Subtraction of two fractions:");
        result = Subtraction(f1,f2);
        result.Print();
        System.out.println("Multiplication of two fractions:");
        result=Multiply(f1,f2);
        result.Print();
        System.out.println("Division of two fractions:");
        result=Division(f1,f2);
        result.Print();
    }
}


