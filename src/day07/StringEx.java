package day07;
// 자바의 문자열은 String 객체로 생성된다.
//    String name;
//    String hobby;
//    name = "신세계";   //스트링 리터럴 표현으로 값을 할당할 수 있다. 문자열은 String 객체로 생성되고, 객체의 번지가 name(참조변수) 할당

public class StringEx {
    public static void main(String[] args) {
        String name1 = "신세계";
        String name2 = "신세경";

        String name3 = new String("신세계");
        String name4 = new String("신세경");
        String name5 = new String("하하하");
        String name6 = "하하하";

        System.out.println("name1 : " + name1.hashCode());
        System.out.println("name2 : " + name2.hashCode());
        System.out.println("name3 : " + name3.hashCode());
        System.out.println("name4 : " + name4.hashCode());
        System.out.println("name5 : " + name5.hashCode());
        System.out.println("name6 : " + name6.hashCode());
        System.out.println(name6.equals(name4));


    }
}
