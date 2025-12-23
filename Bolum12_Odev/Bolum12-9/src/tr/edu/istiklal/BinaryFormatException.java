package tr.edu.istiklal;

public class BinaryFormatException extends Exception {

  public BinaryFormatException() {
    super("0 ve 1 dışında bir karakter tespit edildi");
  }

    public BinaryFormatException(String message) {
        super(message);
    }
}
