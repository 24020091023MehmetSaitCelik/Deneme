package tr.edu.istiklal;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException() {
        super("Geçersiz üçgen oluşturuldu.");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
