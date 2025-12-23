package tr.edu.istiklal;
import java.util.Date;
public class Loan {
    private double faiz;
    private int yilSayisi;
    private double krediMiktari;
    private Date tarih;


    public Loan() {
        this(2.5, 1, 1000);
    }
    public Loan(double faiz, int yilSayisi, double krediMiktari) {

        if (faiz <= 0){
            throw new IllegalArgumentException("Yıllık faiz oranı 0'dan büyük olmalıdır.");
        }

        if (yilSayisi <= 0) {
            throw new IllegalArgumentException("Yıl sayısı 0'dan büyük olmalıdır.");
        }
        if (krediMiktari <= 0) {
            throw new IllegalArgumentException("Kredi miktarı 0'dan büyük olmalıdır.");
        }
        this.faiz = faiz;
        this.yilSayisi = yilSayisi;
        this.krediMiktari = krediMiktari;
        tarih = new Date();
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = faiz / 1200;
        double monthlyPayment = krediMiktari * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, yilSayisi * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * yilSayisi * 12;
        return totalPayment;
    }


}