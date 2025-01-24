package day13.Inheritance_03;

public class Phone {
    private String bander;
    private String model;
    private String color;

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getBander() {
        return bander;
    }



    public Phone() {
        System.out.println("Phone() 생성자 실행");
    }

}
