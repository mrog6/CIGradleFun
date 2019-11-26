import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void testConstructor() {
        Fraction test = new Fraction(5, 10);
        assertEquals(test.getNumerator(), 5);
        assertEquals(test.getDenominator(), 10);
    }
    @Test
    public void testToString() {
        Fraction test = new Fraction(5, 10);
        assertEquals(test.toString(), "5/10");
    }
//    @Test
//    public void testGetRealValue() {
//        Fraction test = new Fraction(5, 10);
//        assertEquals(test.getRealValue(), 0.5);
//    }
//    @Test
//    public void testReduce() {
//        Fraction test = new Fraction(5, 10);
//        assertEquals(test.reduce(test), new Fraction(1, 2));
//    }
//    @Test
//    public void testAdd() {
//
//    }
//    @Test
//    public void testEquals() {
//
//    }
//    @Test
//    public void testCompareTo() {
//
//    }

//    public static void main(String[] args) {
//        Fraction fraction = new Fraction(10, 20);
//        fraction.reduce(fraction);
//
//    }
}
