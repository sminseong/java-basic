package day12;

public class SingletonStatic {
    private static SingletonStatic instance;

    private SingletonStatic() {}

//    static {
//        try {
//            instance = new SingletonStatic();
//        } catch (Exception e) {
//            throw new RuntimeException("싱글톤 객체 생성 오류");
//        }
//    }
    public static SingletonStatic getInstance() {
        //외부에서 정적메소드인 getInstance() 호출하면 이 때 초기화 진행(lazy)
        if (instance == null) instance = new SingletonStatic();

        return instance;
    }

}
