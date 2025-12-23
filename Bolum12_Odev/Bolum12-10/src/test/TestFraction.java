package test;
import tr.edu.istiklal.*;
public class TestFraction {
    public static void main(String[] args) {
        try {
            Fraction f1 = new Fraction(3, 4);
            Fraction f2 = new Fraction(5, 0);
        } catch (NullDenominatorException e) {
            System.out.println(e.getMessage());
        }
    }
}
