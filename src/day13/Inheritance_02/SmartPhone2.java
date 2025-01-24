package day13.Inheritance_02;

public class SmartPhone2 extends SmartPhone{

    boolean wifi1;

    public SmartPhone2() {
        //super();
    }

    public SmartPhone2(String bander, String model, String color) {
        super(bander, model, color);
    }

    public void setWifi(boolean wifi) {
        this.wifi1 = super.isWifi();
        String model = super.getModel();

        System.out.println(model + " 의 wifi 상태를 변경하였습니다.");
        internet();
    }
}
