package day05.MorningTest;

public class Test05_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (int)(5/9f * (fahrenheit - 32) * 100 + 0.5f) / 100f;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celcius: " + celcius);
    }
}
