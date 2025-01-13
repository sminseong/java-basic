package day04.Homework;

public class HomeWork5 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area_1 = (lengthTop+lengthBottom) * height / 2.0;
        double area_2 = (lengthTop+lengthBottom) * height * 1.0 / 2;
        double area_3 = (double)(lengthTop+lengthBottom) * height / 2;
        //double area_4 = (double)((lengthTop+lengthBottom) * height / 2);

        System.out.println(area_1);
        System.out.println(area_2);
        System.out.println(area_3);
        //System.out.println(area_4);
    }
}
