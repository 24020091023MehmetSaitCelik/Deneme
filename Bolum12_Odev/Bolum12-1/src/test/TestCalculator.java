    package test;
    import tr.edu.istiklal.Calculator;

    import javax.swing.*;
    import java.util.InputMismatchException;
    import java.util.Scanner;

    public class TestCalculator {
                public static void main(String[] args) {
                    if (args.length != 3) {
                        System.out.println("Kullanım: java TestException 5 + 3");

                    }
                    Scanner input=new Scanner(System.in);

                    try {

                        double s1 = input.nextDouble();
                        input.nextLine();
                        String islem=input.nextLine();
                        double s2 = input.nextDouble();
                        Calculator calc = new Calculator(s1, s2);
                        double sonuc = 0;
                        if (islem.equals("+")) sonuc = calc.getTopla();
                        else if (islem.equals("-")) sonuc = calc.getCikar();
                        else if (islem.equals("*")) sonuc = calc.getCarp();
                        else if (islem.equals("/")) sonuc = calc.getBol();

                        System.out.println("Sonuç: " + sonuc);

                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }



