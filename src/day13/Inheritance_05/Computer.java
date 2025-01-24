package day13.Inheritance_05;

// 계산기 기능 + 웹브라이징 + 영화보기 + 원의 면적 계산(확장)
public class Computer extends Calculator {

    private double radius;

    public Computer() {}

    public Computer(double r) {
        this.radius = r;
    }

    // 원의 면적 계산 기능 : areaCompute
    public void areaCompute() {
        System.out.println("원의 면적을 계산하는 기능을 수행합니다.");
        double result = Math.PI * this.radius * this.radius;
        System.out.printf("계산이 끝났습니다. 면적은 : %.1f%n", result);
    }

    public static void main(String[] args) {
        //사각형의 면적을 구한다.
        Calculator cal = new Calculator(10, 20);
        cal.areaCompute();
        //원의 면적을 구한다.
        Computer com = new Computer(3);
        com.areaCompute();

        Calculator cal1 = new Computer();
    }
}
