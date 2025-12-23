package tr.edu.istiklal;

public class HexFormatException extends Exception {

     public HexFormatException(){
       super("Input string is not a valid hexadecimal number.");
     }


}
