package tr.edu.istiklal;

public class BinaryConverter {

    public static int bin2Dec(String binary) throws BinaryFormatException {
        int decimalValue = 0;

        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);

            if (ch != '0' && ch != '1') {
                 throw new BinaryFormatException("0 ve 1 dışında bir karakter tespit edildi" + ch);
            }

            decimalValue = decimalValue * 2 + (ch - '0');
        }






        return decimalValue;
    }


}
