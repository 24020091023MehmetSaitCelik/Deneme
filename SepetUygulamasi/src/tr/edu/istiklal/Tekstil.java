
package tr.edu.istiklal;


public class Tekstil extends Urun {
    private String kumasTuru;
    private int beden;
    private String ureticiFirma;

    public Tekstil(String urunAdi, double urunFiyati,String kumasTuru, int beden, String ureticiFirma) {
        super(urunAdi,urunFiyati);
        this.kumasTuru = kumasTuru;
        this.beden = beden;
        this.ureticiFirma = ureticiFirma;
    }

    @Override
    public double kdvHesapla() {
        return urunFiyati*1.10;
    }

    @Override
    public String toString() {
       return ureticiFirma + " " + kumasTuru + " (Beden: " + beden + ") - " + urunFiyati + " TL";
    }

    
    
    
    
    
    
    
    
    
}
