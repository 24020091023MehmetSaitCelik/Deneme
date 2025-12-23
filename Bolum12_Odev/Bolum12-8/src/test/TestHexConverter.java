package test;

import tr.edu.istiklal.*;

public class TestHexConverter {
    public static void main(String[] args) {

        try {
            System.out.println(HexConverter.hex2Dec("1A3"));
            System.out.println(HexConverter.hex2Dec("J12"));
        } catch (HexFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}