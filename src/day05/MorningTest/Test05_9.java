package day05.MorningTest;

public class Test05_9 {
    public static void main(String[] args) {
        char ch = '@';
        //boolean b = (Character.isDigit(ch) || Character.isAlphabetic(ch))? true: false;
        boolean b = (ch>=48 && ch<=57 || ch>=65 && ch<=90 || ch>=97 && ch<=122)? true: false;

        System.out.println(b);

    }
}
