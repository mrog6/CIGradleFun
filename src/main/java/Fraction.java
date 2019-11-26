public class Fraction implements Comparable<Fraction> {
    protected int numerator;
    protected int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {

            this.numerator = numerator;
            if (denominator != 0) {
                this.denominator = denominator;
            }
            else {
                System.out.println("Invalid input.");
                this.numerator = 0;
                this.denominator = 1;
            }

        if (numerator < 0 && denominator < 0) {
            this.numerator = Math.abs(numerator);
            this.denominator = Math.abs(denominator);
        }
    }

    public double getRealValue() {
        return (getNumerator()/getDenominator());
    }

    public Fraction reduce(Fraction fraction) {
        int num1 = getNumerator();
        int num2 = getDenominator();
        int remainder = 0;
        while (num1 != 0) {
            remainder = num1 % num2;
            num2 = num1;
            num1 = remainder;
        }
        System.out.println("The gcd is " + num2);
        return new Fraction(getNumerator()/num2, getDenominator()/num2);
    }

//    public Fraction add(Fraction fraction) {
//
//    }
//
//    public boolean equals(Fraction fraction) {
//
//    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public int compareTo(Fraction fraction) {
        return 0;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
