package day12;

class GrandFather {
    void printGrandFather() {
        System.out.println("나는 아버지로부터 상속받습니다.");
    }
}
class SubFather extends GrandFather{
    void familyName() {
        System.out.println("나의 아버지는 프로그래머");
    }
    void houseAddress() {
        System.out.println("나의 집은 인천");
    }
    void printFather() {
        System.out.println("나는 아버지입니다. 나는 할아버지로부터 상속받습니다.");
    }
}
class SubSon extends SubFather {
    public SubSon() {
        System.out.println("나는 아들입니다.");
    }
    void printSon() {
        System.out.println("나는 할아버지입니다.");
    }
}

public class InherTest2 {
    public static void main(String[] args) {
        SubSon objSon = new SubSon();

        objSon.printGrandFather();
        objSon.familyName();
        objSon.houseAddress();
        objSon.printFather();
        objSon.printSon();
    }
}
