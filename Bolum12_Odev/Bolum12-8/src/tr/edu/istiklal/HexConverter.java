package tr.edu.istiklal;

public class HexConverter {

    public static int hex2Dec(String hexString) throws HexFormatException {

        int decimalValue = 0;

        for (int i = 0; i < hexString.length(); i++) {
            char ch = Character.toUpperCase(hexString.charAt(i));

            if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F'))) {
                throw new NumberFormatException("Geçersiz hexadecimal karakter: " + ch);
            }

            if (ch >= '0' && ch <= '9') {
                decimalValue = decimalValue * 16 + (ch - '0');
            } else {
                decimalValue = decimalValue * 16 + (ch - 'A' + 10);
            }
        }

        return decimalValue;
    }
    private static boolean isHexCharacter(char ch) {
        return (ch >= '0' && ch <= '9') ||
                (ch >= 'A' && ch <= 'F');
    }

    private static int hexCharToDecimal(char ch) {
        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else {
            return ch - 'A' + 10;
        }
    }

}
