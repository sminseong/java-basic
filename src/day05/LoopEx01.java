package day05;

public class LoopEx01 {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++) {
            System.out.print(i+ " ");
        }
        for(int i=65; i<=90; i++) {
            System.out.print((char)i + " ");
        }
        int start = 0;
        while (start <= 4) {
            System.out.print(start + " ");
            start++;
        }
    }
}
