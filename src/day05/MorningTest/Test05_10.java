package day05.MorningTest;

public class Test05_10 {
    public static void main(String[] args) {
        char ch = 'B';

        char lowerCase = (ch>=65 && ch<=90)? (char)(ch+32): ch;

        System.out.println("ch: " + ch);
        System.out.println("ch to lowerCase:" + lowerCase);
    }
}
