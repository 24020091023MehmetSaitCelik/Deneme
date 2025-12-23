package tr.edu.istiklal;

public class Fraction {
    private final int pay;
    private final int payda;

    public Fraction(int pay,int payda) throws NullDenominatorException {
        if (payda==0){
            throw new NullDenominatorException();
        }
        this.pay=pay;
        this.payda=payda;
    }
    public int getPay() {
        return pay;
    }

    public int getPayda() {
        return payda;
    }


}
