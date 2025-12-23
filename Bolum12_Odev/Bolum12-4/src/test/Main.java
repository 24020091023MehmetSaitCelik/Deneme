package test;
import tr.edu.istiklal.Loan;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Yıllık faiz oranını giriniz");
            double faiz = input.nextDouble();

            System.out.print("Yıl sayısını giriniz");
            int yilSayisi = input.nextInt();

            System.out.print("Kredi miktarını girin: ");
            double krediMiktari = input.nextDouble();

            Loan loan = new Loan(faiz, yilSayisi, krediMiktari);

            System.out.printf("Kredi oluşturuldu. Aylık ödeme: %.2f\n",loan.getMonthlyPayment());

        } catch (IllegalArgumentException ex) {

            System.out.println("!!!!!!!!HATA!!!!!!!!: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Beklenmedik bir hata oluştu.");

        }

        System.out.println("Program çalışmaya devam ediyor...");
    }
}