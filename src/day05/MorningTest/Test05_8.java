package day05.MorningTest;

public class Test05_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = (int)a + b;

        char ch = 'A';
        ch = (char)(ch + 2);

        float f = 3/2f;
        long l = 3000 * 3000 * 3000L;

        float f2 = 0.1f;
        double d = 0.1;

        boolean result = d!=f2;

        System.out.println("c= "+c);
        System.out.println("ch= "+ch);
        System.out.println("f= "+f);
        System.out.println("l= "+l);
        System.out.println("result= "+result);
    }
}
