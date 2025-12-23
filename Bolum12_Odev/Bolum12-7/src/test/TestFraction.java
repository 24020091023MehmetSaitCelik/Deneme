package test;
import tr.edu.istiklal.*;
public class TestFraction {
    public static void main(String[] args){

        try{
            Fraction fraction = new Fraction(10, 0);
           } catch (NullDenominatorException e) {
            System.out.println(e.getMessage());
        }
    }
}