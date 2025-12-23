package test;
import tr.edu.istiklal.*;
public class TestBinaryConverter {
    public static void main(String[] args) {

        try{

            System.out.println(BinaryConverter.bin2Dec("10101"));
            System.out.println(BinaryConverter.bin2Dec("10201"));
        }catch (BinaryFormatException e){
            System.out.println(e.getMessage());
        }


    }



}
