package day10;

import day10.dto.Person;

public class PersonMain {
    public static void main(String[] args) {
//        Person 서민성 = new Person();
//        //서민성.name = "서민성";
//        서민성.setName("서민성");
//        서민성.setAge(26);
//        서민성.setPhone("010-1111-2222");

        Person 최문규 = new Person("최문규", 27, "010-9999-8888");
        System.out.println(최문규.getName() + 최문규.eat());


        // 자신 이름의 객체 생성 , 생성자 오버로딩한 생성자 이용.
        Person 서민성 = new Person("서민성", 26, "010-1111-2222");
        // 서민성 운동한다.
        System.out.println(서민성.getName() + " " + 서민성.play());

        // 서민성 점심시간에 우동을 먹다.
        System.out.println(서민성.getName() + " 점심시간에 우동을 " + 서민성.eat());
        // 서민성 점심시간에 걷다.
        System.out.println(서민성.getName() + " 점심시간에 " + 서민성.walk());
    }
}
