package day03;

public class Test_1 {
    public static void main(String[] args) {
        byte bb =10;
        int cc = bb;
        long dd = cc;
        float ff = dd;
        double dou = ff;

        System.out.printf("%f%n", dou);

        char charValue = 'A';
        int intValue = charValue;
        System.out.println(charValue);
        System.out.println(intValue);

        byte byteValue = 65;
        char charValue_1 = (char)byteValue;
        int intValue_1 = byteValue;
    }
}
