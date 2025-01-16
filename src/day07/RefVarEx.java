package day07;

import java.sql.SQLOutput;

class Phone {
    String bander;
    String version;
    //String
}

public class RefVarEx {
    public static void main(String[] args) {
//        int[] arr1;     //정수형 배열 변수 arr1 선언
//        int[] arr2;
//        int[] arr3;
//
//        arr1 = new int[] {1, 2, 3};
//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr1[2]);
//
//        for (int i=0; i< arr1.length; i++) {
//            System.out.println(arr1[i] + " " + arr1.hashCode());
//        }
//
//        for (int i : arr1) {
//            System.out.println(i);
//        }
//
//        Phone phone1 = new Phone();
//        Phone phone2 = new Phone();
//        Phone phone3 = null;
//
//        System.out.println(phone1 == phone2);
//        System.out.println(phone1 == phone3);
//        //System.out.println(phone2 == phone3);

        // 자바는 프로그램 실행 도중에 발생하는 오류를 예외(Exception) 라고 한다.
        // 참조 변수에 null상태에서 객체의 데이터나 메소드를 사용하려면 예외가 발생한다.
//        int[] intArr = new int[] {0, 0, 0, 0};  // null
//        intArr[0] = 10;
//
//        for (int data : intArr) {
//            System.out.print(data + " ");
//        }
//        for (int index=0; index<intArr.length; index++) {
//            System.out.print(intArr[index]);
//        }
        String hobby = "여행";
        hobby = null;       //기존의 "여행" 문자열이 저장된 Heap영역의 주소값을 지웠다.

        String kind1 = "자동차";
        String kind2 = kind1;

        System.out.println(kind1.hashCode() + " " + kind2.hashCode());
        System.out.println(kind1 + " " + kind2);
        kind1 = null;
        System.out.println(kind1.hashCode() + " " + kind2.hashCode());
        System.out.println(kind1 + " " + kind2);
    }
}
