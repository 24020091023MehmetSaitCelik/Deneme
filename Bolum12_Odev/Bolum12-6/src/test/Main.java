package test;
public class Main {

    public static int hex2Dec(String hexString) {

        int decimalValue = 0;

        for (int i = 0; i < hexString.length(); i++) {
            char ch = Character.toUpperCase(hexString.charAt(i));

            if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F'))) {
                throw new NumberFormatException(
                        "Geçersiz hexadecimal karakter: " + ch
                );
            }

            if (ch >= '0' && ch <= '9') {
                decimalValue = decimalValue * 16 + (ch - '0');
            } else {
                decimalValue = decimalValue * 16 + (ch - 'A' + 10);
            }
        }

        return decimalValue;
    }

    public static void main(String[] args) {

        try {
            System.out.println(hex2Dec("1A"));
            System.out.println(hex2Dec("FF"));
            System.out.println(hex2Dec("2G"));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
