package day13.Inheritance;
class GrandFather {
    void printGrandFather() {
        System.out.println("나는 할아버지 입니다.");
    }
}
class Father extends GrandFather {
    String failmyName = "프로그래머";
    String houseAddress = "인천";

    void printFather() {
        System.out.println("나는 아버지 입니다! 나는 할아버지로부터 상속받습니다.");
    }
}
class Son extends Father {
    String name = "홍길동";

    void printSon() {
        System.out.println("나는 아들입니다.");
        System.out.println("나는 아버지로부터 상속받습니다.");
        System.out.println("나의 아버지는 " + this.failmyName);
        System.out.println("나의 집은 " + this.houseAddress);
    }
}
public class Inheritance02 {
    public static void main(String[] args) {
        Son objSon = new Son();
        objSon.printSon();
        objSon.printFather();
        objSon.printGrandFather();
    }
}
